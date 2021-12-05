package es.sergiomendez.apicoches.services.cars;

import es.sergiomendez.apicoches.entities.batteries.EngineBattery;
import es.sergiomendez.apicoches.entities.cars.*;
import es.sergiomendez.apicoches.entities.engines.ElectricEngine;
import es.sergiomendez.apicoches.exceptions.*;
import es.sergiomendez.apicoches.services.airconditioners.AirConditionerFacade;
import es.sergiomendez.apicoches.services.batteries.BatteryFacade;
import es.sergiomendez.apicoches.services.engines.EngineFacade;
import org.springframework.stereotype.Component;

@Component
public class CarFactory {

    BatteryFacade batteryFacade = new BatteryFacade();
    EngineFacade engineFacade = new EngineFacade();
    AirConditionerFacade airConditionerFacade = new AirConditionerFacade();

    private Car car;

    private CarFactory() {}

    public CarFactory(String type) throws CarTypeNotFoundException, BatteryTypeNotFoundException,
            EngineTypeNotFoundException, AirConditionerTypeNotFoundException {

        switch (type) {
            case "electric", "eléctrico", "electrico" -> this.car = new ElectricCarBuilder("Coche eléctrico por defecto")
                    .addColor("Rojo metalizado")
                    .addDoors(5)
                    .addBattery(batteryFacade.createBattery("arranque"))
                    .addEngine(engineFacade.createEngine("electrico"))
                    .addAirConditioner(airConditionerFacade.createAirConditioner("estandar"))
                    .addEngineBattery((EngineBattery) batteryFacade.createBattery("motriz"))
                    .build();
            case "combustion", "combustión" -> this.car = new CombustionCarBuilder("Coche de combustión por defecto")
                    .addColor("Rojo metalizado")
                    .addDoors(5)
                    .addBattery(batteryFacade.createBattery("arranque"))
                    .addEngine(engineFacade.createEngine("combustion"))
                    .addAirConditioner(airConditionerFacade.createAirConditioner("estandar"))
                    .addGasTank("Tanque de 55L de aluminio")
                    .build();
            case "hibrido", "híbrido", "hybrid" -> this.car = new HybridCarBuilder("Coche de combustión por defecto")
                    .addColor("Rojo metalizado")
                    .addDoors(5)
                    .addBattery(batteryFacade.createBattery("arranque"))
                    .addEngine(engineFacade.createEngine("combustion"))
                    .addAirConditioner(airConditionerFacade.createAirConditioner("estandar"))
                    .addGasTank("Tanque de 55L de aluminio")
                    .addElectricEngine((ElectricEngine) engineFacade.createEngine("electrico"))
                    .build();
            default -> throw new CarTypeNotFoundException(type);
        }
    }

    public CarFactory(Car newCar) throws NullCarException {

        if (newCar instanceof ElectricCar) {
            this.car = new ElectricCarBuilder(newCar.getName())
                    .addColor(newCar.getColor())
                    .addDoors(newCar.getDoors())
                    .addBattery(newCar.getBattery())
                    .addEngine(newCar.getEngine())
                    .addAirConditioner(newCar.getAirConditioner())
                    .addEngineBattery(((ElectricCar) newCar).getEngineBattery())
                    .build();
        } else if (newCar instanceof HybridCar) {
            this.car = new HybridCarBuilder(newCar.getName())
                    .addColor(newCar.getColor())
                    .addDoors(newCar.getDoors())
                    .addBattery(newCar.getBattery())
                    .addEngine(newCar.getEngine())
                    .addAirConditioner(newCar.getAirConditioner())
                    .addGasTank(((HybridCar) newCar).getGasTank())
                    .addElectricEngine(((HybridCar) newCar).getEngine2())
                    .build();
        } else if (newCar instanceof CombustionCar) {
            this.car = new CombustionCarBuilder(newCar.getName())
                    .addColor(newCar.getColor())
                    .addDoors(newCar.getDoors())
                    .addBattery(newCar.getBattery())
                    .addEngine(newCar.getEngine())
                    .addAirConditioner(newCar.getAirConditioner())
                    .addGasTank(((CombustionCar) newCar).getGasTank())
                    .build();
        } else {
            throw new NullCarException();
        }

    }

    public Car getCar() {
        return this.car;
    }

    public Car getStartedCar() {
        this.car.startBattery();
        this.car.startEngine();
        this.car.startAirConditioner();
        if (car instanceof CombustionCar) {
            ((CombustionCar) car).fillTank();
        }
        return this.car;
    }

}

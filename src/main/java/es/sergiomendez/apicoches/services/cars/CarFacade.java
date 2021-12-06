package es.sergiomendez.apicoches.services.cars;

import es.sergiomendez.apicoches.dtos.CarDto;
import es.sergiomendez.apicoches.dtos.CombustionCarDto;
import es.sergiomendez.apicoches.dtos.ElectricCarDto;
import es.sergiomendez.apicoches.dtos.HybridCarDto;
import es.sergiomendez.apicoches.entities.batteries.EngineBattery;
import es.sergiomendez.apicoches.entities.cars.*;
import es.sergiomendez.apicoches.entities.engines.ElectricEngine;
import es.sergiomendez.apicoches.exceptions.*;
import es.sergiomendez.apicoches.services.AirConditionerFactory;
import es.sergiomendez.apicoches.services.BatteryFactory;
import es.sergiomendez.apicoches.services.EngineFactory;
import org.springframework.stereotype.Component;

@Component
public class CarFacade {

    private Car car;

    public Car createCar(String type) throws EngineTypeNotFoundException, CarTypeNotFoundException,
            AirConditionerTypeNotFoundException, BatteryTypeNotFoundException {
        switch (type) {
            case "electric", "eléctrico", "electrico" -> car = new ElectricCarBuilder("Coche eléctrico por defecto")
                    .addColor("Rojo metalizado")
                    .addDoors(5)
                    .addBattery(new BatteryFactory("arranque").getBattery())
                    .addEngine(new EngineFactory("electrico").getEngine())
                    .addAirConditioner(new AirConditionerFactory("estandar").getAirConditioner())
                    .addEngineBattery((EngineBattery) new BatteryFactory("motriz").getBattery())
                    .build();
            case "combustion", "combustión", "gasolina" -> car = new CombustionCarBuilder("Coche de combustión por defecto")
                    .addColor("Rojo metalizado")
                    .addDoors(5)
                    .addBattery(new BatteryFactory("arranque").getBattery())
                    .addEngine(new EngineFactory("combustion").getEngine())
                    .addAirConditioner(new AirConditionerFactory("estandar").getAirConditioner())
                    .addGasTank("Tanque de 55L de aluminio")
                    .build();
            case "hibrido", "híbrido", "hybrid" -> car = new HybridCarBuilder("Coche híbrido por defecto")
                    .addColor("Rojo metalizado")
                    .addDoors(5)
                    .addBattery(new BatteryFactory("arranque").getBattery())
                    .addEngine(new EngineFactory("combustion").getEngine())
                    .addElectricEngine((ElectricEngine) new EngineFactory("electrico").getEngine())
                    .addAirConditioner(new AirConditionerFactory("estandar").getAirConditioner())
                    .addGasTank("Tanque de 55L de aluminio")
                    .build();
            default -> throw new CarTypeNotFoundException(type);
        }

        return car;
    }

    public Car createCar(CarDto newCar) throws NullCarException {

        if (newCar instanceof ElectricCarDto) {
            car = new ElectricCarBuilder(newCar.getName())
                    .addColor(newCar.getColor())
                    .addDoors(newCar.getDoors())
                    .addBattery(newCar.getBattery())
                    .addEngine(newCar.getEngine())
                    .addAirConditioner(newCar.getAirConditioner())
                    .addEngineBattery(((ElectricCarDto) newCar).getEngineBattery())
                    .build();
        } else if (newCar instanceof HybridCarDto) {
            car = new HybridCarBuilder(newCar.getName())
                    .addColor(newCar.getColor())
                    .addDoors(newCar.getDoors())
                    .addBattery(newCar.getBattery())
                    .addEngine(newCar.getEngine())
                    .addAirConditioner(newCar.getAirConditioner())
                    .addGasTank(((HybridCarDto) newCar).getGasTank())
                    .addElectricEngine(((HybridCarDto) newCar).getEngine2())
                    .build();
        } else if (newCar instanceof CombustionCarDto) {
            car = new CombustionCarBuilder(newCar.getName())
                    .addColor(newCar.getColor())
                    .addDoors(newCar.getDoors())
                    .addBattery(newCar.getBattery())
                    .addEngine(newCar.getEngine())
                    .addAirConditioner(newCar.getAirConditioner())
                    .addGasTank(((CombustionCarDto) newCar).getGasTank())
                    .build();
        } else {
            throw new NullCarException();
        }

        return car;
    }
}

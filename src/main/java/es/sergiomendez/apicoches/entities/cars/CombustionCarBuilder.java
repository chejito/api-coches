package es.sergiomendez.apicoches.entities.cars;

import es.sergiomendez.apicoches.entities.airconditioners.AirConditioner;
import es.sergiomendez.apicoches.entities.batteries.Battery;
import es.sergiomendez.apicoches.entities.engines.Engine;

public class CombustionCarBuilder {

    private CombustionCar car;

    public CombustionCarBuilder() {}

    public CombustionCarBuilder(String name) {
        car = new CombustionCar();
        car.setName(name);
    }

    public CombustionCarBuilder addColor(String color) {
        car.setColor(color);
        return this;
    }

    public CombustionCarBuilder addDoors(Integer doors) {
        car.setDoors(doors);
        return this;
    }

    public CombustionCarBuilder addBattery(Battery battery) {
        car.setBattery(battery);
        return this;
    }

    public CombustionCarBuilder addEngine(Engine engine) {
        car.setEngine(engine);
        return this;
    }

    public CombustionCarBuilder addAirConditioner(AirConditioner airConditioner) {
        car.setAirConditioner(airConditioner);
        return this;
    }

    public CombustionCarBuilder addGasTank(String gasTank) {
        car.setGasTank(gasTank);
        return this;
    }

    public CombustionCar build() {
        return this.car;
    }
}

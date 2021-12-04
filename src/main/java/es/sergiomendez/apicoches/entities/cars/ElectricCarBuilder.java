package es.sergiomendez.apicoches.entities.cars;

import es.sergiomendez.apicoches.entities.airconditioners.AirConditioner;
import es.sergiomendez.apicoches.entities.batteries.Battery;
import es.sergiomendez.apicoches.entities.batteries.EngineBattery;
import es.sergiomendez.apicoches.entities.engines.Engine;

public class ElectricCarBuilder {

    private ElectricCar car;

    public ElectricCarBuilder() {}

    public ElectricCarBuilder(String name) {
        car = new ElectricCar();
        car.setName(name);
    }

    public ElectricCarBuilder addColor(String color) {
        car.setColor(color);
        return this;
    }

    public ElectricCarBuilder addDoors(Integer doors) {
        car.setDoors(doors);
        return this;
    }

    public ElectricCarBuilder addBattery(Battery battery) {
        car.setBattery(battery);
        return this;
    }

    public ElectricCarBuilder addEngine(Engine engine) {
        car.setEngine(engine);
        return this;
    }

    public ElectricCarBuilder addAirConditioner(AirConditioner airConditioner) {
        car.setAirConditioner(airConditioner);
        return this;
    }

    public ElectricCarBuilder addEngineBattery(EngineBattery battery) {
        car.setEngineBattery(battery);
        return this;
    }

    public ElectricCar build() {
        return this.car;
    }
}

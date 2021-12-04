package es.sergiomendez.apicoches.entities.cars;

import es.sergiomendez.apicoches.entities.airconditioners.AirConditioner;
import es.sergiomendez.apicoches.entities.batteries.Battery;
import es.sergiomendez.apicoches.entities.engines.ElectricEngine;
import es.sergiomendez.apicoches.entities.engines.Engine;

public class HybridCarBuilder {

    private HybridCar car;

    public HybridCarBuilder() {}

    public HybridCarBuilder(String name) {
        car = new HybridCar();
        car.setName(name);
    }

    public HybridCarBuilder addColor(String color) {
        car.setColor(color);
        return this;
    }

    public HybridCarBuilder addDoors(Integer doors) {
        car.setDoors(doors);
        return this;
    }

    public HybridCarBuilder addBattery(Battery battery) {
        car.setBattery(battery);
        return this;
    }

    public HybridCarBuilder addEngine(Engine engine) {
        car.setEngine(engine);
        return this;
    }

    public HybridCarBuilder addAirConditioner(AirConditioner airConditioner) {
        car.setAirConditioner(airConditioner);
        return this;
    }

    public HybridCarBuilder addGasTank(String gasTank) {
        car.setGasTank(gasTank);
        return this;
    }

    public HybridCarBuilder addElectricEngine(ElectricEngine engine) {
        car.setEngine2(engine);
        return this;
    }

    public HybridCar build() {
        return this.car;
    }

}

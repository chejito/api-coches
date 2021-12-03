package es.sergiomendez.apicoches.entities.cars;

import es.sergiomendez.apicoches.entities.engines.ElectricEngine;

public class ElectricCar extends Car {

    ElectricEngine engine;
    String engineBatteries;
    Boolean engineOn;
    Boolean engineBatteriesOn;

    public ElectricCar() {}

    public ElectricCar(String name, String color, Integer doors, String battery, String airConditioner,
                       ElectricEngine engine, String engineBatteries) {
        super(name, color, doors, battery, airConditioner);
        this.engine = engine;
        this.engineBatteries = engineBatteries;
        this.engineOn = getEngineOn();
        this.engineBatteriesOn = false;
    }

    public ElectricCar(Long id, String name, String color, Integer doors, String battery, String airConditioner,
                       ElectricEngine engine, String engineBatteries) {
        super(id, name, color, doors, battery, airConditioner);
        this.engine = engine;
        this.engineBatteries = engineBatteries;
        this.engineOn = getEngineOn();
        this.engineBatteriesOn = false;
    }

    @Override
    public void startEngine() {
        if (!engine.getOn()) {
            engine.start();
            setEngineOn(true);
        }
    }

    @Override
    public void stopEngine() {
        if (engine.getOn()) {
            engine.stop();
            setEngineOn(false);
        }
    }

    @Override
    public void startBattery() {
        if (!getBatteryOn()) {
            setBatteryOn(true);
        }
        if (!getEngineBatteriesOn()) {
            setEngineBatteriesOn(true);
        }
    }

    public ElectricEngine getEngine() {
        return engine;
    }

    public void setEngine(ElectricEngine engine) {
        this.engine = engine;
    }

    public String getEngineBatteries() {
        return engineBatteries;
    }

    public void setEngineBatteries(String engineBatteries) {
        this.engineBatteries = engineBatteries;
    }

    @Override
    public Boolean getEngineOn() {
        return engineOn;
    }

    @Override
    public void setEngineOn(Boolean engineOn) {
        this.engineOn = engineOn;
    }

    public Boolean getEngineBatteriesOn() {
        return engineBatteriesOn;
    }

    public void setEngineBatteriesOn(Boolean engineBatteriesOn) {
        this.engineBatteriesOn = engineBatteriesOn;
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", doors=" + doors +
                ", battery='" + battery + '\'' +
                ", airConditioner='" + airConditioner + '\'' +
                ", engine=" + engine +
                ", engineBatteries='" + engineBatteries + '\'' +
                ", batteryOn=" + batteryOn +
                ", airConditionerOn=" + airConditionerOn +
                ", engineOn=" + engineOn +
                ", engineBatteriesOn=" + engineBatteriesOn +
                '}';
    }
}

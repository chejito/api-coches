package es.sergiomendez.apicoches.entities.cars;

import es.sergiomendez.apicoches.entities.airconditioners.AirConditioner;
import es.sergiomendez.apicoches.entities.batteries.Battery;
import es.sergiomendez.apicoches.entities.engines.Engine;

public abstract class Car {

    protected String name;
    protected String color;
    protected Integer doors;
    protected Battery battery;
    protected Engine engine;
    protected AirConditioner airConditioner;
    protected Boolean isBatteryOn;
    protected Boolean isEngineOn;
    protected Boolean isAirConditionerOn;

    public Car() {
        this.isBatteryOn = false;
        this.isEngineOn = false;
        this.isAirConditionerOn = false;
    }

    public Car(String name, String color, Integer doors, Battery battery,
               Engine engine, AirConditioner airConditioner) {
        this.name = name;
        this.color = color;
        this.doors = doors;
        this.battery = battery;
        this.engine = engine;
        this.airConditioner = airConditioner;
        this.isBatteryOn = false;
        this.isEngineOn = false;
        this.isAirConditionerOn = false;
    }

    public void startEngine() {
        if (!engine.getOn()) {
            engine.start();
            setEngineOn(true);
        }
    }

    public void stopEngine() {
        if (engine.getOn()) {
            engine.stop();
            setEngineOn(false);
        }
    }

    public void startBattery() {
        if (!getBatteryOn()) {
            battery.start();
            setBatteryOn(true);
        }
    }

    public void stopBattery() {
        if (getBatteryOn()) {
            battery.stop();
            setBatteryOn(false);
        }
    }

    public void startAirConditioner() {
        if (!getAirConditionerOn()) {
            airConditioner.start();
            setAirConditionerOn(true);
        }
    }

    public void stopAirConditioner() {
        if (getAirConditionerOn()) {
            airConditioner.stop();
            setAirConditionerOn(false);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getDoors() {
        return doors;
    }

    public void setDoors(Integer doors) {
        this.doors = doors;
    }

    public Battery getBattery() {
        return battery;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public AirConditioner getAirConditioner() {
        return airConditioner;
    }

    public void setAirConditioner(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    public Boolean getBatteryOn() {
        return isBatteryOn;
    }

    public void setBatteryOn(Boolean batteryOn) {
        isBatteryOn = batteryOn;
    }

    public Boolean getEngineOn() {
        return isEngineOn;
    }

    public void setEngineOn(Boolean engineOn) {
        isEngineOn = engineOn;
    }

    public Boolean getAirConditionerOn() {
        return isAirConditionerOn;
    }

    public void setAirConditionerOn(Boolean airConditionerOn) {
        isAirConditionerOn = airConditionerOn;
    }
}

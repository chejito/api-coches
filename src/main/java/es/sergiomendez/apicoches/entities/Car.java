package es.sergiomendez.apicoches.entities;

public abstract class Car {

    String name;
    String brand;
    String model;
    String color;
    Integer doors;
    String battery;
    String engine;
    String airConditioner;
    Boolean engineOn;
    Boolean batteryOn;
    Boolean airConditionerOn;

    public Car(String brand, String model, String color, Integer doors, String battery, String engine, String airConditioner) {
        this.name = brand + " " + model;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.doors = doors;
        this.battery = battery;
        this.engine = engine;
        this.airConditioner = airConditioner;
        this.batteryOn = false;
        this.engineOn = false;
        this.airConditionerOn = false;
    }

    public abstract void startBattery();
    public abstract void startEngine();
    public void startAirConditioner() {
        setAirConditionerOn(true);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
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

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getAirConditioner() {
        return airConditioner;
    }

    public void setAirConditioner(String airConditioner) {
        this.airConditioner = airConditioner;
    }

    public Boolean getEngineOn() {
        return engineOn;
    }

    public void setEngineOn(Boolean engineOn) {
        this.engineOn = engineOn;
    }

    public Boolean getBatteryOn() {
        return batteryOn;
    }

    public void setBatteryOn(Boolean batteryOn) {
        this.batteryOn = batteryOn;
    }

    public Boolean getAirConditionerOn() {
        return airConditionerOn;
    }

    public void setAirConditionerOn(Boolean airConditionerOn) {
        this.airConditionerOn = airConditionerOn;
    }
}

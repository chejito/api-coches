package es.sergiomendez.apicoches.entities.cars;

public abstract class Car {

    Long id;
    String name;
    String color;
    Integer doors;
    String battery;
    String airConditioner;
    Boolean batteryOn;
    Boolean airConditionerOn;

    public Car() {
    }

    public Car(String name, String color, Integer doors, String battery, String airConditioner) {
        this.name = name;
        this.color = color;
        this.doors = doors;
        this.battery = battery;
        this.airConditioner = airConditioner;
        this.batteryOn = false;
        this.airConditionerOn = false;
    }

    public Car(Long id, String name, String color, Integer doors, String battery, String airConditioner) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.doors = doors;
        this.batteryOn = false;
        this.airConditionerOn = false;
    }

    public abstract void startEngine();

    public abstract void stopEngine();

    public void startBattery() {
        if (!getBatteryOn()) {
            setBatteryOn(true);
        }
    }

    public void stopBattery() {
        if (getBatteryOn()) {
            setBatteryOn(false);
        }
    }

    public void startAirConditioner() {
        if (!getAirConditionerOn()) {
            setAirConditionerOn(true);
        }
    }

    public void stopAirConditioner() {
        if (getAirConditionerOn()) {
            setAirConditionerOn(false);
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    public String getAirConditioner() {
        return airConditioner;
    }

    public void setAirConditioner(String airConditioner) {
        this.airConditioner = airConditioner;
    }

    public abstract Boolean getEngineOn();

    public abstract void setEngineOn(Boolean engineOn);

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

package es.sergiomendez.apicoches.entities;

public class ElectricCar extends Car {

    String engineBatteries;
    Boolean engineBatteriesOn;

    public ElectricCar(String brand, String model, String color, Integer doors, String battery, String engine, String airConditioner, String engineBatteries) {
        super(brand, model, color, doors, battery, engine, airConditioner);
        this.engineBatteries = engineBatteries;
        this.engineBatteriesOn = false;
    }

    @Override
    public void startBattery() {
        setBatteryOn(true);
        setEngineBatteriesOn(true);
    }

    @Override
    public void startEngine() {
        setEngineOn(true);
    }

    public String getEngineBatteries() {
        return engineBatteries;
    }

    public void setEngineBatteries(String engineBatteries) {
        this.engineBatteries = engineBatteries;
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
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", doors=" + doors +
                ", battery='" + battery + '\'' +
                ", engine='" + engine + '\'' +
                ", airConditioner='" + airConditioner + '\'' +
                ", engineOn=" + engineOn +
                ", batteryOn=" + batteryOn +
                ", airConditionerOn=" + airConditionerOn +
                ", engineBatteries='" + engineBatteries + '\'' +
                ", engineBatteriesOn=" + engineBatteriesOn +
                '}';
    }
}
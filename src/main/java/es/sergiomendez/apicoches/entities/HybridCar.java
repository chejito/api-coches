package es.sergiomendez.apicoches.entities;

public class HybridCar extends Car {

    String engine2;
    Boolean engine2On;

    public HybridCar(String brand, String model, String color, Integer doors, String battery, String engine, String airConditioner, String engine2) {
        super(brand, model, color, doors, battery, engine, airConditioner);
        this.engine2 = engine2;
        this.engine2On = false;
    }

    @Override
    public void startBattery() {
        setBatteryOn(true);
    }

    @Override
    public void startEngine() {
        setEngineOn(true);
        setEngine2On(true);
    }

    public String getEngine2() {
        return engine2;
    }

    public void setEngine2(String engine2) {
        this.engine2 = engine2;
    }

    public Boolean getEngine2On() {
        return engine2On;
    }

    public void setEngine2On(Boolean engine2On) {
        this.engine2On = engine2On;
    }

    @Override
    public String toString() {
        return "HybridCar{" +
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
                ", engine2='" + engine2 + '\'' +
                ", engine2On=" + engine2On +
                '}';
    }
}

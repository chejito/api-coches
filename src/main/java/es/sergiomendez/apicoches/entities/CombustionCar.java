package es.sergiomendez.apicoches.entities;

public class CombustionCar extends Car{

    String gasTank;
    Boolean gasTankEmpty;

    public CombustionCar(String brand, String model, String color, Integer doors, String battery,
                         String engine, String airConditioner, String gasTank) {
        super(brand, model, color, doors, battery, engine, airConditioner);
        this.gasTank = gasTank;
        this.gasTankEmpty = true;
    }

    void fillTank() {

    }

    @Override
    public void startBattery() {
        setBatteryOn(true);
    }

    @Override
    public void startEngine() {
        setEngineOn(true);
    }


    public String getGasTank() {
        return gasTank;
    }

    public void setGasTank(String gasTank) {
        this.gasTank = gasTank;
    }

    public Boolean getGasTankEmpty() {
        return gasTankEmpty;
    }

    public void setGasTankEmpty(Boolean gasTankEmpty) {
        this.gasTankEmpty = gasTankEmpty;
    }

    @Override
    public String toString() {
        return "CombustionCar{" +
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
                ", gasTank='" + gasTank + '\'' +
                ", gasTankEmpty=" + gasTankEmpty +
                '}';
    }
}

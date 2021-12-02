package es.sergiomendez.apicoches.entities.cars;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class HybridCar extends Car {

    @Column
    String engine2;

    @Column
    Boolean engine2On;

    public HybridCar(String brand, String model, String color, Integer doors, String battery, String engine, String airConditioner, String engine2) {
        super(brand, model, color, doors, battery, engine, airConditioner);
        this.engine2 = engine2;
        this.engine2On = false;
    }

    @Override
    public void startBattery() {
        if (!getBatteryOn()) {
            setBatteryOn(true);
        }
    }

    @Override
    public void startEngine() {
        if (!getEngineOn()) {
            setEngineOn(true);
        }
        if (!getEngine2On()) {
            setEngine2On(true);
        }
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

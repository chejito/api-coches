package es.sergiomendez.apicoches.entities.cars;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class CombustionCar extends Car {

    @Column
    String gasTank;

    @Column
    Boolean gasTankEmpty;

    public CombustionCar(String brand, String model, String color, Integer doors, String battery,
                         String engine, String airConditioner, String gasTank) {
        super(brand, model, color, doors, battery, engine, airConditioner);
        this.gasTank = gasTank;
        this.gasTankEmpty = true;
    }

    void fillTank() {
        if (gasTankEmpty) {
            setGasTankEmpty(false);
        }
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

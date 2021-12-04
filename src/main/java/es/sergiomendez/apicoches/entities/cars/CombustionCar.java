package es.sergiomendez.apicoches.entities.cars;

import es.sergiomendez.apicoches.entities.airconditioners.AirConditioner;
import es.sergiomendez.apicoches.entities.batteries.Battery;
import es.sergiomendez.apicoches.entities.engines.Engine;

public class CombustionCar extends Car {

    protected String gasTank;
    protected Boolean isGasTankEmpty;

    public CombustionCar() {}

    public CombustionCar(String name, String color, Integer doors, Battery battery, Engine engine,
                         AirConditioner airConditioner, String gasTank) {
        super(name, color, doors, battery, engine, airConditioner);
        this.gasTank = gasTank;
        this.isGasTankEmpty = true;
    }

    public void fillTank() {
        if (isGasTankEmpty) {
            setGasTankEmpty(false);
        }
    }

    public String getGasTank() {
        return gasTank;
    }

    public void setGasTank(String gasTank) {
        this.gasTank = gasTank;
    }

    public Boolean getGasTankEmpty() {
        return isGasTankEmpty;
    }

    public void setGasTankEmpty(Boolean gasTankEmpty) {
        isGasTankEmpty = gasTankEmpty;
    }

    @Override
    public String toString() {
        return "CombustionCar{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", doors=" + doors +
                ", battery=" + battery +
                ", engine=" + engine +
                ", airConditioner=" + airConditioner +
                ", gasTank='" + gasTank + '\'' +
                ", isBatteryOn=" + isBatteryOn +
                ", isEngineOn=" + isEngineOn +
                ", isAirConditionerOn=" + isAirConditionerOn +
                ", isGasTankEmpty=" + isGasTankEmpty +
                '}';
    }
}

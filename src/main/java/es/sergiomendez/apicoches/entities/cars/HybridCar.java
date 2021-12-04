package es.sergiomendez.apicoches.entities.cars;

import es.sergiomendez.apicoches.entities.airconditioners.AirConditioner;
import es.sergiomendez.apicoches.entities.batteries.Battery;
import es.sergiomendez.apicoches.entities.engines.ElectricEngine;
import es.sergiomendez.apicoches.entities.engines.Engine;

public class HybridCar extends CombustionCar {

    private ElectricEngine engine2;
    private Boolean isEngine2On;

    public HybridCar() {}

    public HybridCar(String name, String color, Integer doors, Battery battery, Engine engine,
                     AirConditioner airConditioner, String gasTank, ElectricEngine engine2) {
        super(name, color, doors, battery, engine, airConditioner, gasTank);
        this.engine2 = engine2;
        this.isEngine2On = false;
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

    @Override
    public void stopEngine() {
        if (engine.getOn()) {
            engine.stop();
            setEngineOn(false);
        }
        if (engine2.getOn()) {
            engine2.stop();
            setEngine2On(false);
        }
    }

    public ElectricEngine getEngine2() {
        return engine2;
    }

    public void setEngine2(ElectricEngine engine2) {
        this.engine2 = engine2;
    }

    public Boolean getEngine2On() {
        return isEngine2On;
    }

    public void setEngine2On(Boolean engine2On) {
        isEngine2On = engine2On;
    }

    @Override
    public String toString() {
        return "HybridCar{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", doors=" + doors +
                ", battery=" + battery +
                ", engine=" + engine +
                ", engine2=" + engine2 +
                ", airConditioner=" + airConditioner +
                ", isBatteryOn=" + isBatteryOn +
                ", isEngineOn=" + isEngineOn +
                ", isEngine2On=" + isEngine2On +
                ", isAirConditionerOn=" + isAirConditionerOn +
                '}';
    }
}

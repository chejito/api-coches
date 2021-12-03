package es.sergiomendez.apicoches.entities.cars;

import es.sergiomendez.apicoches.entities.engines.CombustionEngine;
import es.sergiomendez.apicoches.entities.engines.ElectricEngine;

public class HybridCar extends Car {

    CombustionEngine engine;
    ElectricEngine engine2;
    Boolean engineOn;
    Boolean engine2On;

    public HybridCar() {}

    public HybridCar(String name, String color, Integer doors, String battery, String airConditioner,
                     CombustionEngine engine, ElectricEngine engine2) {
        super(name, color, doors, battery, airConditioner);
        this.engine = engine;
        this.engine2 = engine2;
        this.engineOn = engine.getOn();
        this.engine2On = engine.getOn();
    }

    public HybridCar(Long id, String name, String color, Integer doors, String battery, String airConditioner,
                     CombustionEngine engine, ElectricEngine engine2) {
        super(id, name, color, doors, battery, airConditioner);
        this.engine = engine;
        this.engine2 = engine2;
        this.engineOn = engine.getOn();
        this.engine2On = engine.getOn();
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

    public CombustionEngine getEngine() {
        return engine;
    }

    public void setEngine(CombustionEngine engine) {
        this.engine = engine;
    }

    public ElectricEngine getEngine2() {
        return engine2;
    }

    public void setEngine2(ElectricEngine engine2) {
        this.engine2 = engine2;
    }

    @Override
    public Boolean getEngineOn() {
        return engineOn;
    }

    @Override
    public void setEngineOn(Boolean engineOn) {
        this.engineOn = engineOn;
    }

    public Boolean getEngine2On() {
        return engine2On;
    }

    public void setEngine2On(Boolean engine2On) {
        this.engine2On = engine2On;
    }
}

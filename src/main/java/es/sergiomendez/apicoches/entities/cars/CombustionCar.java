package es.sergiomendez.apicoches.entities.cars;

import es.sergiomendez.apicoches.entities.engines.CombustionEngine;

public class CombustionCar extends Car {

    CombustionEngine engine;
    String gasTank;
    Boolean engineOn;
    Boolean gasTankEmpty;

    public CombustionCar() {}

    public CombustionCar(String name, String color, Integer doors, String battery, String airConditioner,
                         CombustionEngine engine, String gasTank) {
        super(name, color, doors, battery, airConditioner);
        this.engine = engine;
        this.gasTank = gasTank;
        this.engineOn = engine.getOn();
        this.gasTankEmpty = true;
    }

    public CombustionCar(Long id, String name, String color, Integer doors, String battery, String airConditioner,
                         CombustionEngine engine, String gasTank) {
        super(id, name, color, doors, battery, airConditioner);
        this.engine = engine;
        this.gasTank = gasTank;
        this.engineOn = engine.getOn();
        this.gasTankEmpty = true;
    }

    void fillTank() {
        if (gasTankEmpty) {
            setGasTankEmpty(false);
        }
    }
    @Override
    public void startEngine() {
        if (!engine.getOn()) {
            engine.start();
            setEngineOn(true);
        }
    }

    @Override
    public void stopEngine() {
        if (engine.getOn()) {
            engine.stop();
            setEngineOn(false);
        }
    }

    public CombustionEngine getEngine() {
        return engine;
    }

    public void setEngine(CombustionEngine engine) {
        this.engine = engine;
    }

    public String getGasTank() {
        return gasTank;
    }

    public void setGasTank(String gasTank) {
        this.gasTank = gasTank;
    }

    @Override
    public Boolean getEngineOn() {
        return engineOn;
    }

    @Override
    public void setEngineOn(Boolean engineOn) {
        this.engineOn = engineOn;
    }

    public Boolean getGasTankEmpty() {
        return gasTankEmpty;
    }

    public void setGasTankEmpty(Boolean gasTankEmpty) {
        this.gasTankEmpty = gasTankEmpty;
    }
}

package es.sergiomendez.apicoches.entities.cars;

import es.sergiomendez.apicoches.entities.airconditioners.AirConditioner;
import es.sergiomendez.apicoches.entities.batteries.Battery;
import es.sergiomendez.apicoches.entities.batteries.EngineBattery;
import es.sergiomendez.apicoches.entities.engines.Engine;

public class ElectricCar extends Car {

    private EngineBattery engineBattery;
    private Boolean isEngineBatteryOn;

    public ElectricCar() {}

    public ElectricCar(String name, String color, Integer doors, Battery battery, Engine engine,
                       AirConditioner airConditioner, EngineBattery engineBattery) {
        super(name, color, doors, battery, engine, airConditioner);
        this.engineBattery = engineBattery;
        this.isEngineBatteryOn = false;
    }

    @Override
    public void startBattery() {
        if (!getBatteryOn()) {
            setBatteryOn(true);
        }
        if (!getEngineBatteryOn()) {
            setEngineBatteryOn(true);
        }
    }

    public EngineBattery getEngineBattery() {
        return engineBattery;
    }

    public void setEngineBattery(EngineBattery engineBattery) {
        this.engineBattery = engineBattery;
    }

    public Boolean getEngineBatteryOn() {
        return isEngineBatteryOn;
    }

    public void setEngineBatteryOn(Boolean engineBatteryOn) {
        isEngineBatteryOn = engineBatteryOn;
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", doors=" + doors +
                ", battery=" + battery +
                ", engineBattery=" + engineBattery +
                ", engine=" + engine +
                ", airConditioner=" + airConditioner +
                ", isBatteryOn=" + isBatteryOn +
                ", isEngineBatteryOn=" + isEngineBatteryOn +
                ", isEngineOn=" + isEngineOn +
                ", isAirConditionerOn=" + isAirConditionerOn +
                '}';
    }
}

package es.sergiomendez.apicoches.entities.batteries;

public class EngineBatteryBuilder {
    private EngineBattery battery;

    public EngineBatteryBuilder() {}

    public EngineBatteryBuilder(String name) {
        battery = new EngineBattery();
        battery.setName(name);
    }

    public EngineBatteryBuilder addVolts(Integer volts){
        battery.setVolts(volts);
        return this;
    }

    public EngineBatteryBuilder addAh(Integer ah){
        battery.setAh(ah);
        return this;
    }

    public EngineBatteryBuilder addStartStop(Boolean startStop){
        battery.setStartStopCompatible(startStop);
        return this;
    }

    public EngineBatteryBuilder addReach(Integer reach){
        battery.setReach(reach);
        return this;
    }

    public EngineBatteryBuilder addType(String type){
        battery.setType(type);
        return this;
    }

    public EngineBatteryBuilder addChargeCycles(Integer cycles){
        battery.setChargeCycles(cycles);
        return this;
    }

    public Battery build() {
        return this.battery;
    }
}




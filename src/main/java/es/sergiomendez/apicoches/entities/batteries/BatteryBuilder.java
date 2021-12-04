package es.sergiomendez.apicoches.entities.batteries;

public class BatteryBuilder {
    private Battery battery;

    public BatteryBuilder() {}

    public BatteryBuilder(String name) {
        battery = new Battery();
        battery.setName(name);
    }

    public BatteryBuilder addVolts(Integer volts){
        battery.setVolts(volts);
        return this;
    }

    public BatteryBuilder addAh(Integer ah){
        battery.setAh(ah);
        return this;
    }

    public BatteryBuilder addStartStop(Boolean startStop){
        battery.setStartStopCompatible(startStop);
        return this;
    }

    public Battery build() {
        return this.battery;
    }
}




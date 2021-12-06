package es.sergiomendez.apicoches.entities.batteries;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = Battery.class, name = "arranque"),
        @JsonSubTypes.Type(value = EngineBattery.class, name = "motriz")
})
public class Battery {

    protected String name;
    protected Integer volts;
    protected Integer ah;
    protected Boolean isStartStopCompatible;
    protected Boolean isOn;

    public Battery() {
        this.isOn = false;
    }


    public Battery(String name, Integer volts, Integer ah, Boolean isStartStopCompatible) {
        this.name = name;
        this.volts = volts;
        this.ah = ah;
        this.isStartStopCompatible = isStartStopCompatible;
        this.isOn = false;
    }

    public void start() {
        if(!getOn()) {
            setOn(true);
        }
    }

    public void stop() {
        if(getOn()) {
            setOn(false);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getVolts() {
        return volts;
    }

    public void setVolts(Integer volts) {
        this.volts = volts;
    }

    public Integer getAh() {
        return ah;
    }

    public void setAh(Integer ah) {
        this.ah = ah;
    }

    public Boolean getStartStopCompatible() {
        return isStartStopCompatible;
    }

    public void setStartStopCompatible(Boolean startStopCompatible) {
        isStartStopCompatible = startStopCompatible;
    }

    public Boolean getOn() {
        return isOn;
    }

    public void setOn(Boolean on) {
        isOn = on;
    }

    @Override
    public String toString() {
        return "Battery{" +
                "name='" + name + '\'' +
                ", volts=" + volts +
                ", ah=" + ah +
                ", isStartStopCompatible=" + isStartStopCompatible +
                ", isOn=" + isOn +
                '}';
    }
}

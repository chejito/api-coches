package es.sergiomendez.apicoches.entities.batteries;

public class Battery {

    protected String name;
    protected Integer volts;
    protected Integer ah;
    protected Boolean isStartStopCompatible;
    protected Boolean isOn = false;

    public Battery() {}

    public Battery(String name, Integer volts, Integer ah, Boolean isStartStopCompatible) {
        this.name = name;
        this.volts = volts;
        this.ah = ah;
        this.isStartStopCompatible = isStartStopCompatible;
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
}

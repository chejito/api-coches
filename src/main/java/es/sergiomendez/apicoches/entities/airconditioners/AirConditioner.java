package es.sergiomendez.apicoches.entities.airconditioners;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = AirConditioner.class, name = "estandar"),
        @JsonSubTypes.Type(value = HVAC.class, name = "climatizador")
})
public class AirConditioner {

    protected String name;
    protected Integer power;
    protected Boolean isOn;
    protected Boolean isCooling;

    public AirConditioner() {
        this.isOn = false;
        this.isCooling = false;
    }

    public AirConditioner(String name, Integer power) {
        this.name = name;
        this.power = power;
        this.isOn = false;
        this.isCooling = false;
    }

    public void start() {
        if(!getOn()) {
            setOn(true);
            setCooling((true));
        }
    }

    public void stop() {
        if(getOn()) {
            setOn(false);
            setCooling(false);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public Boolean getOn() {
        return isOn;
    }

    public void setOn(Boolean on) {
        isOn = on;
    }

    public Boolean getCooling() {
        return isCooling;
    }

    public void setCooling(Boolean cooling) {
        isCooling = cooling;
    }

    @Override
    public String toString() {
        return "AirConditioner{" +
                "name='" + name + '\'' +
                ", power=" + power +
                ", isOn=" + isOn +
                ", isCooling=" + isCooling +
                '}';
    }
}

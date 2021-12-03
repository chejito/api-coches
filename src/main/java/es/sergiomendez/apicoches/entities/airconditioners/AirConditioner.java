package es.sergiomendez.apicoches.entities.airconditioners;

public class AirConditioner {

    protected String name;
    protected Integer power;
    protected Boolean isOn = false;
    protected Boolean isCooling = false;

    public AirConditioner() {}

    public AirConditioner(String name, Integer power) {
        this.name = name;
        this.power = power;
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

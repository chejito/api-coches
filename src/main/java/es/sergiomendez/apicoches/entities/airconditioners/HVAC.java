package es.sergiomendez.apicoches.entities.airconditioners;

public class HVAC extends AirConditioner {

    private Boolean isHeating = false;

    public HVAC() {}

    public HVAC(String name, Integer power) {
        super(name, power);
    }

    public void switchMode() {
        if (getHeating()) {
            setHeating(false);
            setCooling(true);
        } else {
            setHeating(true);
            setCooling(false);
        }
    }

    public Boolean getHeating() {
        return isHeating;
    }

    public void setHeating(Boolean heating) {
        isHeating = heating;
    }

    @Override
    public String toString() {
        return "HVAC{" +
                "name='" + name + '\'' +
                ", power=" + power +
                ", isOn=" + isOn +
                ", isCooling=" + isCooling +
                ", isHeating=" + isHeating +
                '}';
    }
}

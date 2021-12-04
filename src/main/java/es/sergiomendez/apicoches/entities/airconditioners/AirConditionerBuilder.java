package es.sergiomendez.apicoches.entities.airconditioners;

public class AirConditionerBuilder {

    private AirConditioner airConditioner;

    public AirConditionerBuilder() {}

    public AirConditionerBuilder(String name) {
        airConditioner = new AirConditioner();
        airConditioner.setName(name);
    }

    public AirConditionerBuilder addPower(Integer power) {
        airConditioner.setPower(power);
        return this;
    }

    public AirConditioner build() {
        return this.airConditioner;
    }
}

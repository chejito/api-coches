package es.sergiomendez.apicoches.entities.airconditioners;

public class HVACBuilder {
    private HVAC hvac;

    public HVACBuilder() {}

    public HVACBuilder(String name) {
        hvac = new HVAC();
        hvac.setName(name);
    }

    public HVACBuilder addPower(Integer power) {
        hvac.setPower(power);
        return this;
    }

    public HVAC build() {
        return this.hvac;
    }
}

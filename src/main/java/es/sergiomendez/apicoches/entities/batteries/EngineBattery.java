package es.sergiomendez.apicoches.entities.batteries;

public class EngineBattery extends Battery {

    private Integer reach;
    private String type;
    private Integer chargeCycles;

    public EngineBattery() {}

    public EngineBattery(String name, Integer volts, Integer ah, Boolean isStartStopCompatible,
                         Integer reach, String type, Integer chargeCycles) {
        super(name, volts, ah, isStartStopCompatible);
        this.reach = reach;
        this.type = type;
        this.chargeCycles = chargeCycles;
    }

    public Integer getReach() {
        return reach;
    }

    public void setReach(Integer reach) {
        this.reach = reach;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getChargeCycles() {
        return chargeCycles;
    }

    public void setChargeCycles(Integer chargeCycles) {
        this.chargeCycles = chargeCycles;
    }

    @Override
    public String toString() {
        return "EngineBattery{" +
                "name='" + name + '\'' +
                ", volts=" + volts +
                ", ah=" + ah +
                ", isStartStopCompatible=" + isStartStopCompatible +
                ", reach=" + reach +
                ", type='" + type + '\'' +
                ", chargeCycles=" + chargeCycles +
                ", isOn=" + isOn +
                '}';
    }
}

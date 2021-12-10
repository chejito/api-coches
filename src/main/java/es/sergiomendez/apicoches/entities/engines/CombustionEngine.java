package es.sergiomendez.apicoches.entities.engines;

public class CombustionEngine extends Engine {

    private String fuelType;
    private Integer cc;

    public CombustionEngine() {
    }

    public CombustionEngine(String name, String fuelType, Integer hp, Integer cc) {
        super(name, hp);
        this.fuelType = fuelType;
        this.cc = cc;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public Integer getCc() {
        return cc;
    }

    public void setCc(Integer cc) {
        this.cc = cc;
    }

    @Override
    public String toString() {
        return "CombustionEngine{" +
                "name='" + name + '\'' +
                ", fuelType='" + fuelType + '\'' +
                ", hp=" + hp +
                ", cc=" + cc +
                ", isOn=" + isOn +
                '}';
    }
}

package es.sergiomendez.apicoches.entities.engines;

public class ElectricEngine extends Engine {

    private Integer power;

    public ElectricEngine() {
    }

    public ElectricEngine(String name, Integer hp, Integer power) {
        super(name, hp);
        this.power = power;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "ElectricEngine{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", power=" + power +
                ", isOn=" + isOn +
                '}';
    }
}

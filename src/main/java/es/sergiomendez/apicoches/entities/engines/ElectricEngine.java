package es.sergiomendez.apicoches.entities.engines;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class ElectricEngine extends Engine {

    @Column
    Integer capacity;

    @Column
    Integer power;

    public ElectricEngine() {
    }

    public ElectricEngine(String brand, String model, Boolean isOn,
                          Integer capacity, Integer power) {
        super(brand, model, isOn);
        this.capacity = capacity;
        this.power = power;
    }

    public ElectricEngine(Long id, String brand, String model, Boolean isOn,
                          Integer capacity, Integer power) {
        super(id, brand, model, isOn);
        this.capacity = capacity;
        this.power = power;
    }

    @Override
    public void start() {
        if(!getOn()) {
            setOn(true);
        }
    }

    @Override
    public String toString() {
        return "ElectricEngine{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", capacity=" + capacity +
                ", power=" + power +
                ", isOn=" + isOn +
                '}';
    }
}

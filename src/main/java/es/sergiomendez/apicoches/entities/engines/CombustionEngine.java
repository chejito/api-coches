package es.sergiomendez.apicoches.entities.engines;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class CombustionEngine extends Engine {

    @Column
    String fuelType;

    @Column
    Integer hp;

    @Column
    Integer cc;

    public CombustionEngine() {
    }

    public CombustionEngine(String brand, String model, Boolean isOn,
                            String fuelType, Integer hp, Integer cc) {
        super(brand, model, isOn);
        this.fuelType = fuelType;
        this.hp = hp;
        this.cc = cc;
    }

    public CombustionEngine(Long id, String brand, String model, Boolean isOn,
                            String fuelType, Integer hp, Integer cc) {
        super(id, brand, model, isOn);
        this.fuelType = fuelType;
        this.hp = hp;
        this.cc = cc;
    }

    @Override
    public void start() {
        if(!getOn()) {
            setOn(true);
        }

    }

    @Override
    public String toString() {
        return "CombustionEngine{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", isOn=" + isOn +
                ", fuelType='" + fuelType + '\'' +
                ", hp=" + hp +
                ", cc=" + cc +
                '}';
    }
}

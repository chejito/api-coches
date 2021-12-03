package es.sergiomendez.apicoches.entities.engines;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table(name="combustion_engines")
public class CombustionEngine extends Engine {

    @Column
    String fuelType;

    @Column
    Integer cc;

    public CombustionEngine() {
    }

    public CombustionEngine(String name, String fuelType, Integer hp, Integer cc) {
        super(name, hp);
        this.fuelType = fuelType;
        this.cc = cc;
    }

    public CombustionEngine(Long id, String name, String fuelType, Integer hp, Integer cc) {
        super(id, name, hp);
        this.fuelType = fuelType;
        this.cc = cc;
    }

    @Override
    public String toString() {
        return "CombustionEngine{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", fuelType='" + fuelType + '\'' +
                ", hp=" + hp +
                ", cc=" + cc +
                ", isOn=" + isOn +
                '}';
    }
}

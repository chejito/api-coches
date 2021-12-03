package es.sergiomendez.apicoches.entities.engines;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table(name="electric_engines")
public class ElectricEngine extends Engine {

    @Column
    Integer power;

    public ElectricEngine() {
    }

    public ElectricEngine(String name, Integer hp, Integer power) {
        super(name, hp);
        this.power = power;
    }

    public ElectricEngine(Long id, String name, Integer hp, Integer power) {
        super(id, name, hp);
        this.power = power;
    }

    @Override
    public String toString() {
        return "ElectricEngine{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hp=" + hp +
                ", power=" + power +
                ", isOn=" + isOn +
                '}';
    }
}

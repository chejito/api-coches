package es.sergiomendez.apicoches.entities.engines;

import javax.persistence.*;

@MappedSuperclass
public abstract class Engine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column
    String name;

    @Column
    Integer hp;

    @Column
    Boolean isOn;

    public Engine() {
    }

    public Engine(String name, Integer hp) {
        this.name = name;
        this.hp = hp;
        this.isOn = false;
    }

    public Engine(Long id, String name, Integer hp) {
        this.id = id;
        this.name = name;
        this.hp = hp;
        this.isOn = false;
    }

    public void start() {
        if(!getOn()) {
            setOn(true);
        }
    }

    public void stop() {
        if(getOn()) {
            setOn(false);
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public Boolean getOn() {
        return isOn;
    }

    public void setOn(Boolean on) {
        isOn = on;
    }
}

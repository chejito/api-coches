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
    String brand;

    @Column
    String model;

    @Column
    Boolean isOn;

    public Engine() {
    }

    public Engine(String brand, String model, Boolean isOn) {
        this.name = brand + " " + model;
        this.brand = brand;
        this.model = model;
        this.isOn = isOn;
    }

    public Engine(Long id, String brand, String model, Boolean isOn) {
        this.name = brand + " " + model;
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.isOn = isOn;
    }

    public abstract void start();

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

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Boolean getOn() {
        return isOn;
    }

    public void setOn(Boolean on) {
        isOn = on;
    }
}

package es.sergiomendez.apicoches.dtos;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import es.sergiomendez.apicoches.entities.airconditioners.AirConditioner;
import es.sergiomendez.apicoches.entities.batteries.Battery;
import es.sergiomendez.apicoches.entities.cars.Car;
import es.sergiomendez.apicoches.entities.engines.Engine;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = ElectricCarDto.class, name = "electrico"),
        @JsonSubTypes.Type(value = HybridCarDto.class, name = "hibrido"),
        @JsonSubTypes.Type(value = CombustionCarDto.class, name = "combustion")
})
public abstract class CarDto {

    protected String name;
    protected String color;
    protected Integer doors;
    protected Battery battery;
    protected Engine engine;
    protected AirConditioner airConditioner;

    public CarDto() {}

    public CarDto(String name, String color, Integer doors, Battery battery,
                  Engine engine, AirConditioner airConditioner) {
        this.name = name;
        this.color = color;
        this.doors = doors;
        this.battery = battery;
        this.engine = engine;
        this.airConditioner = airConditioner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getDoors() {
        return doors;
    }

    public void setDoors(Integer doors) {
        this.doors = doors;
    }

    public Battery getBattery() {
        return battery;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public AirConditioner getAirConditioner() {
        return airConditioner;
    }

    public void setAirConditioner(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

}

package es.sergiomendez.apicoches.dtos;

import es.sergiomendez.apicoches.entities.airconditioners.AirConditioner;
import es.sergiomendez.apicoches.entities.batteries.Battery;
import es.sergiomendez.apicoches.entities.engines.Engine;
import org.springframework.stereotype.Component;

@Component
public class CombustionCarDto extends CarDto {

    protected String gasTank;

    public CombustionCarDto() {}

    public CombustionCarDto(String name, String color, Integer doors, Battery battery, Engine engine, AirConditioner airConditioner, String gasTank) {
        super(name, color, doors, battery, engine, airConditioner);
        this.gasTank = gasTank;
    }

    public String getGasTank() {
        return gasTank;
    }

    public void setGasTank(String gasTank) {
        this.gasTank = gasTank;
    }

}

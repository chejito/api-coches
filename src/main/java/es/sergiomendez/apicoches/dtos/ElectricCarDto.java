package es.sergiomendez.apicoches.dtos;

import es.sergiomendez.apicoches.entities.airconditioners.AirConditioner;
import es.sergiomendez.apicoches.entities.batteries.Battery;
import es.sergiomendez.apicoches.entities.batteries.EngineBattery;
import es.sergiomendez.apicoches.entities.engines.Engine;
import org.springframework.stereotype.Component;

@Component
public class ElectricCarDto extends CarDto {

    private EngineBattery engineBattery;

    public ElectricCarDto() {}

    public ElectricCarDto(String name, String color, Integer doors, Battery battery, Engine engine, AirConditioner airConditioner, EngineBattery engineBattery) {
        super(name, color, doors, battery, engine, airConditioner);
        this.engineBattery = engineBattery;
    }

    public EngineBattery getEngineBattery() {
        return engineBattery;
    }

    public void setEngineBattery(EngineBattery engineBattery) {
        this.engineBattery = engineBattery;
    }

}

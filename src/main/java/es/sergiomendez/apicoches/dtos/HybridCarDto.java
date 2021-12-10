package es.sergiomendez.apicoches.dtos;

import es.sergiomendez.apicoches.entities.airconditioners.AirConditioner;
import es.sergiomendez.apicoches.entities.batteries.Battery;
import es.sergiomendez.apicoches.entities.engines.ElectricEngine;
import es.sergiomendez.apicoches.entities.engines.Engine;
import org.springframework.stereotype.Component;

@Component
public class HybridCarDto extends CombustionCarDto {

    private ElectricEngine engine2;

    public HybridCarDto() {}

    public HybridCarDto(String name, String color, Integer doors, Battery battery, Engine engine,
                        AirConditioner airConditioner, String gasTank, ElectricEngine engine2) {
        super(name, color, doors, battery, engine, airConditioner, gasTank);
        this.engine2 = engine2;
    }

    public ElectricEngine getEngine2() {
        return engine2;
    }

    public void setEngine2(ElectricEngine engine2) {
        this.engine2 = engine2;
    }

}

package es.sergiomendez.apicoches.dtos;

import es.sergiomendez.apicoches.entities.engines.ElectricEngine;
import es.sergiomendez.apicoches.entities.engines.ElectricEngineBuilder;
import org.springframework.stereotype.Component;

@Component
public class ElectricEngineDto extends EngineDto {

    private Integer power;

    public ElectricEngineDto() {
    }


    public ElectricEngineDto(String name, Integer hp, Integer power) {
        super(name, hp);
        this.power = power;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    @Override
    public ElectricEngine getEngineFromDto() {
        return new ElectricEngineBuilder(getName())
                .addHp(getHp())
                .addPower(getPower())
                .build();
    }
}

package es.sergiomendez.apicoches.dtos;

import es.sergiomendez.apicoches.entities.engines.CombustionEngine;
import es.sergiomendez.apicoches.entities.engines.CombustionEngineBuilder;
import org.springframework.stereotype.Component;

@Component
public class CombustionEngineDto extends EngineDto {

    private String fuelType;
    private Integer cc;

    public CombustionEngineDto() {}

    public CombustionEngineDto(String name, String fuelType, Integer hp, Integer cc) {
        super(name, hp);
        this.fuelType = fuelType;
        this.cc = cc;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public Integer getCc() {
        return cc;
    }

    public void setCc(Integer cc) {
        this.cc = cc;
    }

    @Override
    public CombustionEngine getEngineFromDto() {

        return new CombustionEngineBuilder(getName())
                .addHp(getHp())
                .addFuelType(getFuelType())
                .addCc(getCc())
                .build();
    }

}

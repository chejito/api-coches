package es.sergiomendez.apicoches.dtos;

import es.sergiomendez.apicoches.entities.engines.Engine;
import org.springframework.stereotype.Component;

@Component
public abstract class EngineDto {

    protected String name;
    protected Integer hp;

    public EngineDto() {}

    public EngineDto(String name, Integer hp) {
        this.name = name;
        this.hp = hp;
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

    abstract public Engine getEngineFromDto();
}

package es.sergiomendez.apicoches.entities.engines;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = ElectricEngine.class, name = "electrico"),
        @JsonSubTypes.Type(value = CombustionEngine.class, name = "combustion")
})
public abstract class Engine {

    protected String name;
    protected Integer hp;
    protected Boolean isOn;

    public Engine() {
        this.isOn = false;
    }

    public Engine(String name, Integer hp) {
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

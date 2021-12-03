package es.sergiomendez.apicoches.entities.engines;


public abstract class Engine {

    protected String name;
    protected Integer hp;
    protected Boolean isOn = false;

    public Engine() {
    }

    public Engine(String name, Integer hp) {
        this.name = name;
        this.hp = hp;
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

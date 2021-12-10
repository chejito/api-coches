package es.sergiomendez.apicoches.entities.engines;

public class ElectricEngineBuilder {

    private ElectricEngine engine;

    public ElectricEngineBuilder() {}

    public ElectricEngineBuilder(String name) {
        engine = new ElectricEngine();
        engine.setName(name);
    }

    public ElectricEngineBuilder addHp(int hp) {
        engine.setHp(hp);
        return this;
    }

    public ElectricEngineBuilder addPower(int power) {
        engine.setPower(power);
        return this;
    }

    public ElectricEngine build() {
        return this.engine;
    }

}

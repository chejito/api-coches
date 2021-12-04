package es.sergiomendez.apicoches.entities.engines;

public class CombustionEngineBuilder {

    private CombustionEngine engine;

    public CombustionEngineBuilder() {}

    public CombustionEngineBuilder(String name) {
        engine = new CombustionEngine();
        engine.setName(name);
    }

    public CombustionEngineBuilder addFuelType(String fuelType) {
        engine.setFuelType(fuelType);
        return this;
    }

    public CombustionEngineBuilder addHp(int hp) {
        engine.setHp(hp);
        return this;
    }

    public CombustionEngineBuilder addCc(int cc) {
        engine.setCc(cc);
        return this;
    }

    public CombustionEngine build() {
        return this.engine;
    }

}

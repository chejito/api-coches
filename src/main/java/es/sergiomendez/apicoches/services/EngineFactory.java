package es.sergiomendez.apicoches.services;

import es.sergiomendez.apicoches.entities.engines.*;
import es.sergiomendez.apicoches.exceptions.EngineTypeNotFoundException;
import es.sergiomendez.apicoches.exceptions.NullEngineException;
import org.springframework.stereotype.Component;

@Component
public class EngineFactory {

    private Engine engine;

    private EngineFactory() {}

    public EngineFactory(String type) throws EngineTypeNotFoundException {
        switch (type) {
            case "electric", "eléctrico", "electrico" -> engine = new ElectricEngineBuilder("Motor eléctrico por defecto")
                    .addHp(70)
                    .addPower(125)
                    .build();
            case "combustion", "combustión" -> engine = new CombustionEngineBuilder("Motor de combustión por defecto")
                    .addHp(110)
                    .addFuelType("gasolina")
                    .addCc(1400)
                    .build();
            default -> throw new EngineTypeNotFoundException(type);
        }
    }

    public EngineFactory(Engine newEngine) throws NullEngineException {

        if (newEngine instanceof ElectricEngine) {
            engine = new ElectricEngineBuilder(newEngine.getName())
                    .addHp(newEngine.getHp())
                    .addPower(((ElectricEngine) newEngine).getPower())
                    .build();
        } else if (newEngine instanceof CombustionEngine) {
            engine = new CombustionEngineBuilder(newEngine.getName())
                    .addHp(newEngine.getHp())
                    .addFuelType(((CombustionEngine) newEngine).getFuelType())
                    .addCc(((CombustionEngine) newEngine).getCc())
                    .build();
        } else {
            throw new NullEngineException();
        }
    }

    public Engine getEngine() {
        return engine;
    }

}

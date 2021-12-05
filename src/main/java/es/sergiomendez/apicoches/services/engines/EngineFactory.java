package es.sergiomendez.apicoches.services.engines;

import es.sergiomendez.apicoches.entities.engines.*;
import es.sergiomendez.apicoches.exceptions.EngineNotFoundException;
import es.sergiomendez.apicoches.exceptions.EngineTypeNotFoundException;
import es.sergiomendez.apicoches.exceptions.NullEngineException;
import org.springframework.stereotype.Component;

@Component
public class EngineFactory {
    private Engine engine;

    private EngineFactory() {}

    public EngineFactory(String type) throws EngineTypeNotFoundException {

        switch (type) {
            case "electric", "eléctrico", "electrico" -> this.engine = new ElectricEngineBuilder("Motor eléctrico por defecto")
                    .addHp(70)
                    .addPower(125)
                    .build();
            case "combustion", "combustión" -> this.engine = new CombustionEngineBuilder("Motor de combustión por defecto")
                    .addHp(110)
                    .addFuelType("gasolina")
                    .addCc(1400)
                    .build();
            default -> throw new EngineTypeNotFoundException(type);
        }
    }

    public EngineFactory(Engine newEngine) throws NullEngineException {

        if (newEngine instanceof ElectricEngine) {
            this.engine = new ElectricEngineBuilder(newEngine.getName())
                    .addHp(newEngine.getHp())
                    .addPower(((ElectricEngine) newEngine).getPower())
                    .build();
        } else if (newEngine instanceof CombustionEngine) {
            this.engine = new CombustionEngineBuilder(newEngine.getName())
                    .addHp(newEngine.getHp())
                    .addFuelType(((CombustionEngine) newEngine).getFuelType())
                    .addCc(((CombustionEngine) newEngine).getCc())
                    .build();
        } else {
            throw new NullEngineException();
        }
    }

    public Engine getEngine() {
        return this.engine;
    }

}

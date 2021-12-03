package es.sergiomendez.apicoches.repositories;

import es.sergiomendez.apicoches.entities.engines.Engine;
import es.sergiomendez.apicoches.exceptions.EngineNotFoundException;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class EngineRepository {

    private final ArrayList<Engine> engines = new ArrayList<>();

    public void updateEngine(Engine oldEngine, Engine newEngine) {
        engines.set(engines.indexOf(oldEngine), newEngine);
    }

    public void saveEngine(Engine engine) {
        this.engines.add(engine);
    }

    public void deleteEngine(Engine engine) {
        this.engines.remove(engine);
    }

    public ArrayList<Engine> getAllEngines() {
        return engines;
    }

    public Engine getEngineByName(String name) {
        try {
            for(Engine engine : engines) {
                if (engine.getName().equalsIgnoreCase(name)) {
                    return engine;
                }
            }

            throw new EngineNotFoundException();

        } catch (EngineNotFoundException e) {
            System.out.println(e.getMessage());
        }

        return null;
    }

}

package es.sergiomendez.apicoches.facades;

import es.sergiomendez.apicoches.entities.engines.Engine;
import es.sergiomendez.apicoches.exceptions.EngineNotFoundException;
import es.sergiomendez.apicoches.factories.EngineFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EngineFacade {
    @Autowired
    EngineFactory factory;

    public Engine createEngine(String type) throws EngineNotFoundException {
        factory = new EngineFactory(type);
        return factory.getEngine();
    }

    public Engine createEngine(Engine engine) throws EngineNotFoundException {
        factory = new EngineFactory(engine);
        return factory.getEngine();
    }

}

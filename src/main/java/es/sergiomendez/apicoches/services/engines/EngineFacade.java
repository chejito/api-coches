package es.sergiomendez.apicoches.services.engines;

import es.sergiomendez.apicoches.entities.engines.Engine;
import es.sergiomendez.apicoches.exceptions.EngineTypeNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EngineFacade {

    @Autowired
    private EngineFactory factory;

    public Engine createEngine(String type) throws EngineTypeNotFoundException {
        factory = new EngineFactory(type);
        return factory.getEngine();
    }

}

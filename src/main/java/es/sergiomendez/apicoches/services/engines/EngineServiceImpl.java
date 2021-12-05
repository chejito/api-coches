package es.sergiomendez.apicoches.services.engines;

import es.sergiomendez.apicoches.controllers.EngineController;
import es.sergiomendez.apicoches.dtos.CombustionEngineDto;
import es.sergiomendez.apicoches.dtos.ElectricEngineDto;
import es.sergiomendez.apicoches.dtos.EngineDto;
import es.sergiomendez.apicoches.entities.engines.Engine;
import es.sergiomendez.apicoches.exceptions.EngineTypeNotFoundException;
import es.sergiomendez.apicoches.exceptions.NullEngineException;
import es.sergiomendez.apicoches.payload.EngineResponse;
import es.sergiomendez.apicoches.payload.MessageResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class EngineServiceImpl implements EngineService {

    @Autowired
    private EngineFacade facade;

    Logger log = LoggerFactory.getLogger(EngineController.class);


    @Override
    public ResponseEntity<?> createEngine(String type) {
        Engine engine;
        try {
            engine = facade.createEngine(type);
            EngineResponse engineResponse = new EngineResponse();
            engineResponse.setMessage("Motor de tipo '" + type + "' genérico creado");
            engineResponse.setEngine(engine);

            return ResponseEntity.ok(engineResponse);

        } catch (EngineTypeNotFoundException e) {
            log.warn(e.getMessage());

            return ResponseEntity
                    .badRequest()
                    .body(new MessageResponse(e.getMessage()));
        }
    }

    @Override
    public ResponseEntity<?> createEngine(EngineDto engineDto) {
        log.warn(engineDto.getName());

        try {
            Engine newEngine = engineDto.getEngineFromDto();
            EngineFactory factory = new EngineFactory(newEngine);
            Engine engine = factory.getEngine();
            EngineResponse engineResponse = new EngineResponse();
            engineResponse.setMessage("Motor creado");
            engineResponse.setEngine(engine);

            return ResponseEntity.ok(engineResponse);

        } catch (NullEngineException e) {
            log.warn(e.getMessage());

            return ResponseEntity
                    .badRequest()
                    .body(new MessageResponse(e.getMessage()));
        }
    }
}

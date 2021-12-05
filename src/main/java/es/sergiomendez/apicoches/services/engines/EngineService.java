package es.sergiomendez.apicoches.services.engines;

import es.sergiomendez.apicoches.dtos.EngineDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface EngineService {

    ResponseEntity<?> createEngine(String type);
    ResponseEntity<?> createEngine(EngineDto newEngine);

}

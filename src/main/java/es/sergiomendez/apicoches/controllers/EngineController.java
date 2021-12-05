package es.sergiomendez.apicoches.controllers;

import es.sergiomendez.apicoches.dtos.EngineDto;
import es.sergiomendez.apicoches.services.engines.EngineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/engines")
public class EngineController {

    @Autowired
    private EngineService service;

    @GetMapping("/type/{type}")
    public ResponseEntity<?> getEngineByType(@PathVariable("type") String type) {
            return service.createEngine(type);
    }

    @PostMapping("/")
    public ResponseEntity<?> createEngine(@Autowired EngineDto engineDto) {
        return service.createEngine(engineDto);
    }

}


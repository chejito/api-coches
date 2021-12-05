package es.sergiomendez.apicoches.controllers;

import es.sergiomendez.apicoches.entities.engines.Engine;
import es.sergiomendez.apicoches.services.engines.EngineFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class EngineController {

    @Autowired
    EngineFacade engineFacade;

    static ArrayList<Engine> engines = new ArrayList<>();


    public ArrayList<Engine> createEngines(String...tipos) {
        for (String tipo : tipos) {
            try {
                Engine engine = engineFacade.createEngine(tipo);
                engines.add(engine);
            } catch(Exception e) {
                System.err.println(e.getMessage());
            }
        }

        return engines;
    }

}


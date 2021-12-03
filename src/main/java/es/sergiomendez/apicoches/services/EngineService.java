package es.sergiomendez.apicoches.services;

import es.sergiomendez.apicoches.entities.engines.Engine;

import java.util.ArrayList;

public interface EngineService {

    void addEngine(Engine engine);
    void updateEngine(Engine oldEngine, Engine newEngine);
    void removeEngine(Engine engine);
    ArrayList<Engine> findAllEngines();
    Engine findEngineByName(String name);

}

package es.sergiomendez.apicoches.services;

import es.sergiomendez.apicoches.entities.engines.Engine;
import es.sergiomendez.apicoches.repositories.EngineRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class EngineServiceImpl implements EngineService {

    EngineRepository repository;

    @Override
    public void addEngine(Engine engine) {
        repository.saveEngine(engine);
    }

    @Override
    public void updateEngine(Engine oldEngine, Engine newEngine) {
        repository.updateEngine(oldEngine, newEngine);
    }


    @Override
    public void removeEngine(Engine engine) {
        repository.deleteEngine(engine);
    }

    @Override
    public ArrayList<Engine> findAllEngines() {
        return repository.getAllEngines();
    }

    @Override
    public Engine findEngineByName(String name) {
        return repository.getEngineByName(name);
    }
}

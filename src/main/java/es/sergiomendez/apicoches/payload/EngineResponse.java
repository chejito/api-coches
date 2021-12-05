package es.sergiomendez.apicoches.payload;

import es.sergiomendez.apicoches.entities.engines.Engine;

public class EngineResponse {
    private String message;
    private Engine engine;

    public EngineResponse() {
    }

    public EngineResponse(String message, Engine engine) {
        this.message = message;
        this.engine = engine;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}

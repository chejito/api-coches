package es.sergiomendez.apicoches.exceptions;

public class EngineNotFoundException extends Exception {
    public EngineNotFoundException() {
        super("Error: Motor no encontrado");
    }
}

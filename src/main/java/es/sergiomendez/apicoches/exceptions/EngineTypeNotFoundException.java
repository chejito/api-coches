package es.sergiomendez.apicoches.exceptions;

public class EngineTypeNotFoundException extends Exception {
    public EngineTypeNotFoundException(String message) {
        super("Error al crear Motor: No encontrado tipo \"" + message + "\"");
    }
}

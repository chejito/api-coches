package es.sergiomendez.apicoches.exceptions;

public class NullEngineException extends Exception {
    public NullEngineException() {
        super("Error: No se puede crear Motor nulo");
    }
}

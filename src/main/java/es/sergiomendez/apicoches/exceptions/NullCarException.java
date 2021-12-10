package es.sergiomendez.apicoches.exceptions;

public class NullCarException extends Exception {
    public NullCarException() {
        super("Error: No se puede crear Coche nulo");
    }
}

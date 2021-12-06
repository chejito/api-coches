package es.sergiomendez.apicoches.exceptions;

public class NoCarsException extends Exception {
    public NoCarsException() {
        super("Error al borrar Coches: No existe ninguno");
    }
}

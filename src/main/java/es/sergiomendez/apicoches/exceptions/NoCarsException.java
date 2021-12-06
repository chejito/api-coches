package es.sergiomendez.apicoches.exceptions;

public class NoCarsException extends Exception {
    public NoCarsException() {
        super("Error al buscar Coches: No existe ninguno");
    }
}

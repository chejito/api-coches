package es.sergiomendez.apicoches.exceptions;

public class CarTypeNotFoundException extends Exception {
    public CarTypeNotFoundException(String message) {
        super("Error al crear Coche: No encontrado tipo \"" + message + "\"");
    }
}

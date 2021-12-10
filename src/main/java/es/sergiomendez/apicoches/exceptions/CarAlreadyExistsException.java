package es.sergiomendez.apicoches.exceptions;

public class CarAlreadyExistsException extends Exception {
    public CarAlreadyExistsException(String message) {
        super("Error al crear Coche: '" + message +"' ya existe");
    }
}

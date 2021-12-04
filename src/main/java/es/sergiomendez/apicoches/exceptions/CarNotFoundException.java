package es.sergiomendez.apicoches.exceptions;

public class CarNotFoundException extends Exception {
    public CarNotFoundException() {
        super("Error: Coche no encontrado");
    }
}

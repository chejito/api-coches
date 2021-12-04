package es.sergiomendez.apicoches.exceptions;

public class AirConditionerNotFoundException extends Exception {
    public AirConditionerNotFoundException() {
        super("Error: Aire Acondicionado no encontrado");
    }
}

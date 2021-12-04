package es.sergiomendez.apicoches.exceptions;

public class AirConditionerTypeNotFoundException extends Exception {
    public AirConditionerTypeNotFoundException(String message) {
        super("Error al crear Aire Acondicionado: No encontrado tipo \"" + message + "\"");
    }
}

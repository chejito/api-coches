package es.sergiomendez.apicoches.exceptions;

public class BatteryTypeNotFoundException extends Exception {
    public BatteryTypeNotFoundException(String message) {
        super("Error al crear Batería: No encontrado tipo '" + message + "'");
    }
}

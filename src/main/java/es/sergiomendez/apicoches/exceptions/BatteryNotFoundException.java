package es.sergiomendez.apicoches.exceptions;

public class BatteryNotFoundException extends Exception {
    public BatteryNotFoundException() {
        super("Error: Batería no existe");
    }
}

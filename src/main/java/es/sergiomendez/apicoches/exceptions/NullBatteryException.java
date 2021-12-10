package es.sergiomendez.apicoches.exceptions;

public class NullBatteryException extends Exception {
    public NullBatteryException() {
        super("Error: No se puede crear Batería nula");
    }
}

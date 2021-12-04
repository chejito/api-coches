package es.sergiomendez.apicoches.exceptions;

public class NullAirConditionerException extends Exception {
    public NullAirConditionerException() {
        super("Error: No se puede crear Aire Acondicionado nulo");
    }
}

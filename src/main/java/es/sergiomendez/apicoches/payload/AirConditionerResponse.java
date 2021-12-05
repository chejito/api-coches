package es.sergiomendez.apicoches.payload;

import es.sergiomendez.apicoches.entities.airconditioners.AirConditioner;

public class AirConditionerResponse {
    private String message;
    private AirConditioner airConditioner;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public AirConditioner getAirConditioner() {
        return airConditioner;
    }

    public void setAirConditioner(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }
}

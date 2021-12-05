package es.sergiomendez.apicoches.payload;

import es.sergiomendez.apicoches.entities.batteries.Battery;

public class BatteryResponse {
    private String message;
    private Battery battery;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Battery getBattery() {
        return battery;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }
}

package es.sergiomendez.apicoches.payload;

import es.sergiomendez.apicoches.entities.cars.Car;

public class CarResponse {
    private String message;
    private Car car;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}

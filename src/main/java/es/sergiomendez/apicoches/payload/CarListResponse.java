package es.sergiomendez.apicoches.payload;

import es.sergiomendez.apicoches.entities.cars.Car;

import java.util.ArrayList;

public class CarListResponse {
    private String message;
    private ArrayList<Car> cars;

    public CarListResponse() {}

    public CarListResponse(String message, ArrayList<Car> cars) {
        this.message = message;
        this.cars = cars;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void setCars(ArrayList<Car> cars) {
        this.cars = cars;
    }
}

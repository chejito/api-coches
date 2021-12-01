package es.sergiomendez.apicoches.repositories;

import es.sergiomendez.apicoches.entities.Car;
import es.sergiomendez.apicoches.exceptions.CarNotFoundException;

import java.util.ArrayList;

public class CarRepository {

    private final ArrayList<Car> coches = new ArrayList<>();

    public void addCars(ArrayList<Car> coches) {
        this.coches.addAll(coches);
    }

    public void removeCars(ArrayList<Car> coches) {
        this.coches.removeAll(coches);
    }

    public ArrayList<Car> getAllCars() {
        return coches;
    }

    public Car getCarByName(String name) {
        try {
            for(Car coche : coches) {
                if (coche.getName().equalsIgnoreCase(name)) {
                    return coche;
                }
            }

            throw new CarNotFoundException();

        } catch (CarNotFoundException e) {
            System.out.println(e.getMessage());
        }

        return null;
    }
}

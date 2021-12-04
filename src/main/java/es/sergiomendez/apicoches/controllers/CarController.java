package es.sergiomendez.apicoches.controllers;

import es.sergiomendez.apicoches.entities.cars.Car;
import es.sergiomendez.apicoches.facades.CarFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class CarController {

    @Autowired
    CarFacade facade;

    static ArrayList<Car> cars = new ArrayList<>();


    public ArrayList<Car> createCars(String...tipos) {
        for (String tipo : tipos) {
            try {
                Car car = facade.createCar(tipo);
                cars.add(car);
            } catch(Exception e) {
                System.err.println(e.getMessage());
            }
        }

        return cars;
    }

}


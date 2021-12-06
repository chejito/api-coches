package es.sergiomendez.apicoches.repositories;

import es.sergiomendez.apicoches.entities.cars.Car;
import es.sergiomendez.apicoches.exceptions.CarAlreadyExistsException;
import es.sergiomendez.apicoches.exceptions.CarNotFoundException;
import es.sergiomendez.apicoches.exceptions.NoCarsException;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class CarRepository {

    private final ArrayList<Car> cars = new ArrayList<>();

    public ArrayList<Car> getAllCars() {
        return cars;
    }

    public Car getCarByName(String name) throws CarNotFoundException {
        Car result = null;
        for(Car car : cars) {
            if (car.getName().equalsIgnoreCase(name)) {
                result = car;
            }
        }

        if (result == null) {
            throw new CarNotFoundException();
        } else {
            return result;
        }
    }

    public void updateCar(Car oldCar, Car newCar) throws CarNotFoundException {
        int index = -1;

        for (Car car : cars) {
            if (oldCar.getName().equalsIgnoreCase(car.getName())) {
                index = cars.indexOf(car);
            }
        }

        if (index >= 0) {
            cars.set(index, newCar);
        } else {
            throw new CarNotFoundException();
        }
    }

    public void saveCar(Car car) throws CarAlreadyExistsException {
        for (Car oldCar : cars) {
            if (oldCar.getName().equalsIgnoreCase(car.getName())) {
                throw new CarAlreadyExistsException(car.getName());
            }
        }

        cars.add(car);
    }

    public void deleteCarByName(String name) throws CarNotFoundException {
        Car oldCar = getCarByName(name);

        if (oldCar == null) {
            throw new CarNotFoundException();
        } else {
            cars.removeIf(car -> name.equalsIgnoreCase(car.getName()));
        }
    }

    public void deleteAllCars() throws NoCarsException {
        if (cars.isEmpty()) {
            throw new NoCarsException();
        }

        cars.clear();
    }





}

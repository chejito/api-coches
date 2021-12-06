package es.sergiomendez.apicoches.repositories;

import es.sergiomendez.apicoches.entities.cars.Car;
import es.sergiomendez.apicoches.entities.cars.CombustionCar;
import es.sergiomendez.apicoches.entities.cars.ElectricCar;
import es.sergiomendez.apicoches.entities.cars.HybridCar;
import es.sergiomendez.apicoches.exceptions.CarAlreadyExistsException;
import es.sergiomendez.apicoches.exceptions.CarNotFoundException;
import es.sergiomendez.apicoches.exceptions.CarTypeNotFoundException;
import es.sergiomendez.apicoches.exceptions.NoCarsException;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Objects;

@Repository
public class CarRepository {

    private final ArrayList<Car> cars = new ArrayList<>();

    public ArrayList<Car> getAllCars() {
        return cars;
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

    public ArrayList<Car> getCarsByColor(String color) throws NoCarsException {
        ArrayList<Car> carsByColor = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equalsIgnoreCase(color)) {
                carsByColor.add(car);
            }
        }

        if (carsByColor.isEmpty()) {
            throw new NoCarsException();
        }

        return carsByColor;
    }

    public ArrayList<Car> getCarsByDoors(Integer doors) throws NoCarsException {
        ArrayList<Car> carsByDoors = new ArrayList<>();
        for (Car car : cars) {
            if (Objects.equals(car.getDoors(), doors)) {
                carsByDoors.add(car);
            }
        }

        if (carsByDoors.isEmpty()) {
            throw new NoCarsException();
        }

        return carsByDoors;
    }

    public ArrayList<Car> getCarsByType(String type) throws NoCarsException, CarTypeNotFoundException {
        ArrayList<Car> carsByType = new ArrayList<>();
        for (Car car : cars) {
            switch (type){
                case ("electrico"):
                    if (car instanceof ElectricCar) {
                        carsByType.add(car);
                    }
                    break;

                case ("combustion"):
                    if (car instanceof CombustionCar && !(car instanceof HybridCar)) {
                        carsByType.add(car);
                    }
                    break;

                case ("hibrido"):
                    if (car instanceof HybridCar) {
                        carsByType.add(car);
                    }

                default:
                    throw new CarTypeNotFoundException(type);
            }
        }

        if (carsByType.isEmpty()) {
            throw new NoCarsException();
        }

        return carsByType;
    }




}

package es.sergiomendez.apicoches.services.cars;

import es.sergiomendez.apicoches.entities.cars.Car;
import es.sergiomendez.apicoches.exceptions.AirConditionerTypeNotFoundException;
import es.sergiomendez.apicoches.exceptions.BatteryTypeNotFoundException;
import es.sergiomendez.apicoches.exceptions.CarTypeNotFoundException;
import es.sergiomendez.apicoches.exceptions.EngineTypeNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarFacade facade;

    public ArrayList<Car> createCars(String...types) throws CarTypeNotFoundException, EngineTypeNotFoundException, AirConditionerTypeNotFoundException, BatteryTypeNotFoundException {
        ArrayList<Car> cars = new ArrayList<>();

        for (String type : types) {
            Car car = createCar(type);
            cars.add(car);
        }

        return cars;
    }

    public Car createCar(String type) throws CarTypeNotFoundException, EngineTypeNotFoundException, AirConditionerTypeNotFoundException, BatteryTypeNotFoundException {
        Car car;
        car = facade.createCar(type);

        return car;
    }
}

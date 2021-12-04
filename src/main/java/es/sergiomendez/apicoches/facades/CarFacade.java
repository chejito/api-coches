package es.sergiomendez.apicoches.facades;

import es.sergiomendez.apicoches.entities.cars.Car;
import es.sergiomendez.apicoches.exceptions.*;
import es.sergiomendez.apicoches.factories.CarFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CarFacade {

    @Autowired
    CarFactory factory;

    public Car createCar(String type) throws EngineTypeNotFoundException, CarTypeNotFoundException,
            AirConditionerTypeNotFoundException, BatteryTypeNotFoundException {
        factory = new CarFactory(type);
        return factory.getStartedCar();
    }

    public Car createCar(Car car) throws NullCarException {
        factory = new CarFactory(car);
        return factory.getCar();
    }
}

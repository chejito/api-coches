package es.sergiomendez.apicoches.services.cars;

import es.sergiomendez.apicoches.dtos.CarDto;
import es.sergiomendez.apicoches.entities.cars.Car;
import es.sergiomendez.apicoches.entities.cars.CombustionCar;
import es.sergiomendez.apicoches.exceptions.*;
import org.springframework.stereotype.Component;

@Component
public class CarFactory {

    private Car car;

    private CarFactory() {}

    public CarFactory(String type) throws CarTypeNotFoundException, EngineTypeNotFoundException,
            AirConditionerTypeNotFoundException, BatteryTypeNotFoundException {
        car = new CarFacade().createCar(type);
    }

    public CarFactory(CarDto carDto) throws NullCarException {
        car = new CarFacade().createCar(carDto);
    }

    public Car getCar() {
        return this.car;
    }

    public Car getStartedCar() {
        this.car.startBattery();
        this.car.startEngine();
        this.car.startAirConditioner();
        if (car instanceof CombustionCar) {
            ((CombustionCar) car).fillTank();
        }
        return this.car;
    }

}

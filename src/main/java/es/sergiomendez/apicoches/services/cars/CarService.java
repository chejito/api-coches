package es.sergiomendez.apicoches.services.cars;

import es.sergiomendez.apicoches.entities.cars.Car;
import es.sergiomendez.apicoches.exceptions.AirConditionerTypeNotFoundException;
import es.sergiomendez.apicoches.exceptions.BatteryTypeNotFoundException;
import es.sergiomendez.apicoches.exceptions.CarTypeNotFoundException;
import es.sergiomendez.apicoches.exceptions.EngineTypeNotFoundException;
import org.springframework.stereotype.Service;

@Service
public interface CarService {
    Car createCar(String type) throws CarTypeNotFoundException, EngineTypeNotFoundException, AirConditionerTypeNotFoundException, BatteryTypeNotFoundException;
}

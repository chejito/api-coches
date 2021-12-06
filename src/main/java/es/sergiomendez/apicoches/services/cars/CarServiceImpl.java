package es.sergiomendez.apicoches.services.cars;

import es.sergiomendez.apicoches.dtos.CarDto;
import es.sergiomendez.apicoches.entities.cars.Car;
import es.sergiomendez.apicoches.exceptions.*;
import es.sergiomendez.apicoches.payload.CarListResponse;
import es.sergiomendez.apicoches.payload.CarResponse;
import es.sergiomendez.apicoches.payload.MessageResponse;
import es.sergiomendez.apicoches.repositories.CarRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    CarRepository repository;

    Logger log = LoggerFactory.getLogger(CarService.class);

    @Override
    public ResponseEntity<?> getAllCars() {
        ArrayList<Car> cars = repository.getAllCars();
        String message = "Listando todos los coches";
        log.warn(message);

        return ResponseEntity.ok(new CarListResponse(message, cars));
    }

    @Override
    public ResponseEntity<?> getCarByName(String name) {

        try {
            Car car = repository.getCarByName(name);
            String message = "Coche encontrado: " + car.getName();
            log.warn(message);

            return ResponseEntity.ok(new CarResponse(message, car));

        } catch (CarNotFoundException e) {
            log.warn(e.getMessage());

            return ResponseEntity.notFound().build();
        }
    }

    @Override
    public ResponseEntity<?> createCar(String type) {
        try {
            Car car = new CarFactory(type).getStartedCar();
            String message = "Coche de tipo '" + type + "' genérico creado";
            log.warn(message);

            return ResponseEntity.ok(new CarResponse(message, car));

        } catch (Exception e) {
            log.warn(e.getMessage());

            return ResponseEntity.notFound().build();
        }   
    }

    @Override
    public ResponseEntity<?> createCar(CarDto carDto) {

        try {
            Car car = new CarFactory(carDto).getCar();
            String message = "Coche creado: " + car.getName();
            log.warn(message);

            repository.saveCar(car);

            return ResponseEntity.ok(new CarResponse(message, car));

        } catch (Exception e) {
            log.warn(e.getMessage());

            return ResponseEntity
                    .badRequest()
                    .body(new MessageResponse(e.getMessage()));
        }
    }


    @Override
    public ResponseEntity<?> updateCar(CarDto carDto) {
        try {
            Car oldCar = repository.getCarByName(carDto.getName());
            Car car = new CarFactory(carDto).getCar();
            String message = "Coche actualizado: " + car.getName();
            log.warn(message);

            repository.updateCar(oldCar, car);

            return ResponseEntity.ok(new CarResponse(message, car));

        } catch (Exception e) {
            log.warn(e.getMessage());

            return ResponseEntity
                    .badRequest()
                    .body(new MessageResponse(e.getMessage()));
        }
    }

    @Override
    public ResponseEntity<?> deleteAllCars() {
        try {
            repository.deleteAllCars();
            String message = "Eliminados todos los coches";
            log.warn(message);

            return ResponseEntity.ok(new MessageResponse(message));
        } catch (NoCarsException e) {
            log.warn(e.getMessage());

            return ResponseEntity
                    .badRequest()
                    .body(new MessageResponse(e.getMessage()));
        }
    }

    @Override
    public ResponseEntity<?> deleteCarByName(String name) {
        try {
            repository.deleteCarByName(name);
            String message = "Eliminado coche '" + name + "'";
            log.warn(message);

            return ResponseEntity.ok(new MessageResponse(message));
        } catch (CarNotFoundException e) {
            log.warn(e.getMessage());

            return ResponseEntity
                    .badRequest()
                    .body(new MessageResponse(e.getMessage()));
        }

    }
}

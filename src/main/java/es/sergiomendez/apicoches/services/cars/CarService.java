package es.sergiomendez.apicoches.services.cars;

import es.sergiomendez.apicoches.dtos.CarDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface CarService {
    ResponseEntity<?> getAllCars();
    ResponseEntity<?> getCarByName(String name);
    ResponseEntity<?> createCar(String type);
    ResponseEntity<?> createCar(CarDto carDto);
    ResponseEntity<?> updateCar(CarDto carDto);
    ResponseEntity<?> deleteAllCars();
    ResponseEntity<?> deleteCarByName(String name);

}

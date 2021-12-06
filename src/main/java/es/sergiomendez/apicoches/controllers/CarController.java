package es.sergiomendez.apicoches.controllers;

import es.sergiomendez.apicoches.dtos.CarDto;
import es.sergiomendez.apicoches.services.cars.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cars")
public class CarController {

    @Autowired
    private CarService service;

    @GetMapping("/type/{type}")
    public ResponseEntity<?> getCarByType(@PathVariable("type") String type) {
            return service.createCar(type);
    }

    @GetMapping("/")
    public ResponseEntity<?> getAllCars() {
        return service.getAllCars();
    }

    @GetMapping("/{name}")
    public ResponseEntity<?> getCarsByName(@PathVariable("name") String name) {
        return service.getCarByName(name);
    }

    @PostMapping("/")
    public ResponseEntity<?> createCar(@RequestBody CarDto carDto) {
        return service.createCar(carDto);
    }

    @PutMapping("/")
    public ResponseEntity<?> updateCar(@RequestBody CarDto carDto) {
        return service.updateCar(carDto);
    }

    @DeleteMapping("/")
    public ResponseEntity<?> deleteAllCars() {
        return service.deleteAllCars();
    }

    @DeleteMapping("/{name}")
    public ResponseEntity<?> deleteCarByName(@PathVariable("name") String name) {
        return service.deleteCarByName(name);
    }

}


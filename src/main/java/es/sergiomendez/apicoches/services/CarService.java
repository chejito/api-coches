package es.sergiomendez.apicoches.services;

import es.sergiomendez.apicoches.entities.cars.Car;
import es.sergiomendez.apicoches.entities.cars.ElectricCar;
import es.sergiomendez.apicoches.entities.cars.HybridCar;
import es.sergiomendez.apicoches.repositories.CarRepository;

import java.util.ArrayList;
import java.util.List;

public class CarService {

    CarRepository carRepository = new CarRepository();

    public void addCars(Car... coches) {
        carRepository.addCars(new ArrayList<>(List.of(coches)));
    }

    public void removeCars(Car... coches) {
        carRepository.removeCars(new ArrayList<>(List.of(coches)));
    }

    public ArrayList<Car> getAllCars() {
        return carRepository.getAllCars();
    }

    public void showCars() {
        ArrayList<Car> coches = carRepository.getAllCars();
        if (coches.isEmpty()) {
            System.out.println("No hay coches");
        }else {
            for(Car coche : coches) {
                System.out.println(coche.toString());
            }
        }
    }

    public void startBatteries(Car... coches) {
        if (coches.length == 0) {
            System.out.println("No hay coches");
        }else {
            for(Car coche : coches) {
                coche.startBattery();
                if (coche instanceof ElectricCar) {
                    System.out.println("Coche: " + coche.getName() + " enciende ambas baterías.");
                } else {
                    System.out.println("Coche: " + coche.getName() + " enciende la batería.");
                }
            }
        }
    }

    public void checkBatteries() {
        ArrayList<Car> coches = carRepository.getAllCars();
        if (coches.isEmpty()) {
            System.out.println("No hay coches");
        }else {
            for(Car coche : coches) {
                if (coche instanceof ElectricCar) {
                    System.out.println("Coche: " + coche.getName() + " tiene ambas baterías: " +
                            (coche.getBatteryOn() ? "encendidas" : "apagadas"));
                } else {
                    System.out.println("Coche: " + coche.getName() + " tiene la batería: " +
                            (coche.getBatteryOn() ? "encendida" : "apagada"));
                }
            }
        }
    }

    public void startEngines(Car... coches) {

        if (coches.length == 0) {
            System.out.println("No hay coches");
        }else {
            for(Car coche : coches) {
                if (coche.getBatteryOn()) {
                    coche.startEngine();
                    if (coche instanceof HybridCar) {
                        System.out.println("Coche: " + coche.getName() + " enciende ambos motores.");
                    } else {
                        System.out.println("Coche: " + coche.getName() + " enciende el motor.");
                    }
                } else {
                    if (coche instanceof HybridCar) {
                        System.out.println("Coche: " + coche.getName() + " tiene ambas baterías apagadas, no puede arrancar.");
                    } else {
                        System.out.println("Coche: " + coche.getName() + " tiene la batería apagada, no puede arrancar.");
                    }
                }
            }
        }
    }

    public void checkEngines() {
        ArrayList<Car> coches = carRepository.getAllCars();
        if (coches.isEmpty()) {
            System.out.println("No hay coches");
        }else {
            for(Car coche : coches) {
                if (coche instanceof HybridCar) {
                    System.out.println("Coche: " + coche.getName() + " tiene ambos motores: " +
                            (coche.getBatteryOn() ? "encendidos" : "apagados"));
                } else {
                    System.out.println("Coche: " + coche.getName() + " tiene el motor: " +
                            (coche.getBatteryOn() ? "encendido" : "apagado"));
                }
            }
        }
    }

    public void startAirConditioners(Car... coches) {

        if (coches.length == 0) {
            System.out.println("No hay coches");
        }else {
            for(Car coche : coches) {
                if (coche.getBatteryOn()) {
                    coche.startAirConditioner();
                    System.out.println("Coche: " + coche.getName() + " enciende el " + coche.getAirConditioner().toLowerCase());
                } else {
                   System.out.println("Coche: " + coche.getName() + " tiene la batería apagada, no se puede encender.");
                }
            }
        }
    }

    public void checkAirConditioners() {
        ArrayList<Car> coches = carRepository.getAllCars();
        if (coches.isEmpty()) {
            System.out.println("No hay coches");
        }else {
            for(Car coche : coches) {
                System.out.println("Coche: " + coche.getName() + " tiene el " + coche.getAirConditioner().toLowerCase() + " " +
                        (coche.getAirConditionerOn() ? "encendido" : "apagado"));
            }
        }
    }
}

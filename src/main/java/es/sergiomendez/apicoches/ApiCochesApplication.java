package es.sergiomendez.apicoches;

import es.sergiomendez.apicoches.entities.cars.Car;
import es.sergiomendez.apicoches.entities.cars.CombustionCar;
import es.sergiomendez.apicoches.entities.cars.ElectricCar;
import es.sergiomendez.apicoches.entities.cars.HybridCar;
import es.sergiomendez.apicoches.services.CarService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiCochesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiCochesApplication.class, args);

//		CarService carService = new CarService();
//
////		ArrayList<Battery> baterias = new ArrayList<>();
////		ArrayList<Engine> motores = new ArrayList<>();
////		ArrayList<AirConditioner> airesAcondicionados = new ArrayList<>();
//
//		carService.showCars();
//		System.out.println("----------------------------------------");
//
//		Car electric1 = new ElectricCar("Toyota", "Elec", "Azul Eléctrico", 5,
//				"Varta 58344", "Toyota Ion2", "Aire acondicionado", "Tesla 5");
//		Car electric2 = new ElectricCar("Ford", "Ionize", "Rojo Fuego", 3,
//				"Bosch S4001", "Toyota Ion2", "Climatizador", "Ford 3");
//		Car hybrid1 = new HybridCar("Renault", "Arkana", "Naranja Metalizado", 4,
//				"Tudor TB740", "Renault FR3", "Climatizador", "Reanult Eléctrico 1");
//		Car hybrid2 = new HybridCar("Seat", "Ibiza H", "Blanco Polar", 3,
//				"Varta 58344", "VW Serie 1", "Aire acondicionado", "VW Elec 1");
//		Car combustion1 = new CombustionCar("Citroën", "C4", "Verde Botella", 5,
//				"Bosch S4001", "PSA 5-4", "Climatizador", "Tanque 70L gasolina");
//		Car combustion2 = new CombustionCar("Peugeot", "208", "Amarillo Huevo", 3,
//				"Bosch S4001", "PSA 5-4", "Climatizador", "Tanque 55L gasolina");
//
//		carService.addCars(electric1, electric2, hybrid1, hybrid2, combustion1, combustion2);
//		carService.showCars();
//		System.out.println("----------------------------------------");
//		carService.startBatteries(electric1, hybrid2, combustion1);
//		System.out.println("----------------------------------------");
//		carService.checkBatteries();
//		System.out.println("----------------------------------------");
//		carService.startEngines(electric2, hybrid1, hybrid2, combustion1, combustion2);
//		System.out.println("----------------------------------------");
//		carService.checkEngines();
//		System.out.println("----------------------------------------");
//		carService.startAirConditioners(electric1, electric2, hybrid1, hybrid2, combustion1, combustion2);
//		System.out.println("----------------------------------------");
//		carService.checkAirConditioners();
//		System.out.println("----------------------------------------");
//		carService.removeCars(electric2, hybrid2, combustion2);
//		carService.showCars();
//		System.out.println("----------------------------------------");
//		carService.checkBatteries();
//		System.out.println("----------------------------------------");
//		carService.checkEngines();
//		System.out.println("----------------------------------------");
//		carService.checkAirConditioners();

	}
}

package es.sergiomendez.apicoches;

import es.sergiomendez.apicoches.controllers.AirConditionerController;
import es.sergiomendez.apicoches.controllers.BatteryController;
import es.sergiomendez.apicoches.controllers.CarController;
import es.sergiomendez.apicoches.controllers.EngineController;
import es.sergiomendez.apicoches.entities.airconditioners.AirConditioner;
import es.sergiomendez.apicoches.entities.batteries.Battery;
import es.sergiomendez.apicoches.entities.cars.Car;
import es.sergiomendez.apicoches.entities.engines.Engine;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;

@SpringBootApplication
public class ApiCochesApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ApiCochesApplication.class, args);

		EngineController engineController = context.getBean(EngineController.class);
		BatteryController batteryController = context.getBean(BatteryController.class);
		AirConditionerController airConditionerController = context.getBean(AirConditionerController.class);
		CarController carController = context.getBean(CarController.class);

		// Creación de Motores
		ArrayList<Engine> engines = engineController.createEngines("electrico", "combustion", "feo");

		// Creación de Aires Acondicionados
		ArrayList<AirConditioner> airConditioners = airConditionerController.createAirConditioners("estandar",
				"climatizador", "patata");

		// Creación de Baterías
		ArrayList<Battery> batteries = batteryController.createBatteries("normal", "motriz", "azul");

		// Creación de Motores
		ArrayList<Car> cars = carController.createCars("electrico", "combustion", "hibrido", "vapor");

		// Muestra Motores, Aires Acondicionados y Baterías creadas.

		System.out.println("""

				Motores
				---------------------""");
		for (Engine engine : engines) {
			System.out.println(engine);
		}

		System.out.println("""

				Aires Acondicionados
				---------------------""");
		for (AirConditioner airConditioner : airConditioners) {
			System.out.println(airConditioner);
		}

		System.out.println("""

				Baterías
				---------------------""");
		for (Battery battery : batteries) {
			System.out.println(battery);
		}

		System.out.println("""

				Coches
				---------------------""");
		for (Car car : cars) {
			System.out.println(car);
		}


	}
}

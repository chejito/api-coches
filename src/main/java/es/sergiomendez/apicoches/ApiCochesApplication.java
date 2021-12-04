package es.sergiomendez.apicoches;

import es.sergiomendez.apicoches.controllers.AirConditionerController;
import es.sergiomendez.apicoches.controllers.BatteryController;
import es.sergiomendez.apicoches.entities.airconditioners.AirConditioner;
import es.sergiomendez.apicoches.entities.batteries.Battery;
import es.sergiomendez.apicoches.entities.engines.Engine;
import es.sergiomendez.apicoches.facades.AirConditionerFacade;
import es.sergiomendez.apicoches.facades.BatteryFacade;
import es.sergiomendez.apicoches.controllers.EngineController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.Arrays;

@SpringBootApplication
public class ApiCochesApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ApiCochesApplication.class, args);

		EngineController engineController = context.getBean(EngineController.class);
		BatteryController batteryController = context.getBean(BatteryController.class);
		AirConditionerController airConditionerController = context.getBean(AirConditionerController.class);

		// Creación de Motores
		ArrayList<Engine> engines = engineController.createEngines("electrico", "combustion", "feo");

		// Creación de Aires Acondicionados
		ArrayList<AirConditioner> airConditioners = airConditionerController.createAirConditioners("estandar",
				"climatizador", "patata");

		// Creación de Baterías
		ArrayList<Battery> batteries = batteryController.createBatteries("normal", "motriz", "azul");

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


	}
}

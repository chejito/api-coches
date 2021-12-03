package es.sergiomendez.apicoches;

import es.sergiomendez.apicoches.entities.airconditioners.AirConditioner;
import es.sergiomendez.apicoches.entities.airconditioners.HVAC;
import es.sergiomendez.apicoches.entities.engines.CombustionEngine;
import es.sergiomendez.apicoches.entities.engines.ElectricEngine;
import es.sergiomendez.apicoches.facades.EngineFacade;
import es.sergiomendez.apicoches.factories.AirConditionerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiCochesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiCochesApplication.class, args);

		EngineFacade engineFacade = new EngineFacade();

		ElectricEngine electricEngine = null;
		CombustionEngine combustionEngine = null;
		CombustionEngine combustionEngine2 = null;

		try {
			 electricEngine = (ElectricEngine) engineFacade.createEngine("electrico");
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

		try {
			 combustionEngine = (CombustionEngine) engineFacade.createEngine("combustion");
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

		try {
			combustionEngine2 = (CombustionEngine) engineFacade.createEngine("feo");
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}



		AirConditionerFactory airConditionerFactory = new AirConditionerFactory("estandar");
		AirConditioner airConditioner= airConditionerFactory.getAirConditioner();
		airConditionerFactory = new AirConditionerFactory("climatizador");
		HVAC hvac = (HVAC) airConditionerFactory.getAirConditioner();

		System.out.println("""

				Motores
				---------------------""");
		System.out.println(electricEngine);
		System.out.println(combustionEngine);
		System.out.println(combustionEngine2);
		System.out.println("""

				Aires Acondicionados
				---------------------""");
		System.out.println(airConditioner);
		System.out.println(hvac);
	}
}

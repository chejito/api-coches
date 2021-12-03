package es.sergiomendez.apicoches;

import es.sergiomendez.apicoches.entities.airconditioners.AirConditioner;
import es.sergiomendez.apicoches.entities.airconditioners.HVAC;
import es.sergiomendez.apicoches.entities.engines.CombustionEngine;
import es.sergiomendez.apicoches.entities.engines.ElectricEngine;
import es.sergiomendez.apicoches.factories.AirConditionerFactory;
import es.sergiomendez.apicoches.factories.EngineFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiCochesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiCochesApplication.class, args);

		EngineFactory engineFactory = new EngineFactory("electrico");
		ElectricEngine electricEngine = (ElectricEngine) engineFactory.getEngine();
		engineFactory = new EngineFactory("combustion");
		CombustionEngine combustionEngine = (CombustionEngine) engineFactory.getEngine();

		AirConditionerFactory airConditionerFactory = new AirConditionerFactory("estandar");
		AirConditioner airConditioner= airConditionerFactory.getAirConditioner();
		airConditionerFactory = new AirConditionerFactory("climatizador");
		HVAC hvac = (HVAC) airConditionerFactory.getAirConditioner();

		System.out.println("Motores\n" +"---------------------");
		System.out.println(electricEngine);
		System.out.println(combustionEngine);
		System.out.println("Aires Acondicionados\n" +"---------------------");
		System.out.println(airConditioner);
		System.out.println(hvac);



	}


}

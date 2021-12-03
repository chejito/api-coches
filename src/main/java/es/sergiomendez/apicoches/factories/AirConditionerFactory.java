package es.sergiomendez.apicoches.factories;

import es.sergiomendez.apicoches.entities.airconditioners.AirConditioner;
import es.sergiomendez.apicoches.entities.airconditioners.AirConditionerBuilder;
import es.sergiomendez.apicoches.entities.airconditioners.HVAC;
import es.sergiomendez.apicoches.entities.airconditioners.HVACBuilder;
import es.sergiomendez.apicoches.exceptions.AirConditionerNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class AirConditionerFactory {
    private AirConditioner airConditioner;

    private AirConditionerFactory() {}

    public AirConditionerFactory(String type) {
        switch (type) {
            case "estandar", "estándar", "standard" -> this.airConditioner = new AirConditionerBuilder("Aire Acondicionado por defecto")
                    .addPower(2000)
                    .build();
            case "climatizador", "hvac" -> this.airConditioner = new HVACBuilder("Climatizador por defecto")
                    .addPower(2000)
                    .build();
            default -> this.airConditioner = null;
        }
    }

    public AirConditionerFactory(AirConditioner newAirConditioner) throws AirConditionerNotFoundException {
        if (newAirConditioner instanceof HVAC) {
            this.airConditioner = new HVACBuilder("Climatizador por defecto")
                    .addPower(newAirConditioner.getPower())
                    .build();
        } else if (newAirConditioner != null) {
            this.airConditioner = new AirConditionerBuilder("Aire Acondicionado por defecto")
                    .addPower(newAirConditioner.getPower())
                    .build();
        } else {
            throw new AirConditionerNotFoundException();
        }
    }

    public AirConditioner getAirConditioner() {
        return this.airConditioner;
    }
}

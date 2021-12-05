package es.sergiomendez.apicoches.services.airconditioners;

import es.sergiomendez.apicoches.entities.airconditioners.AirConditioner;
import es.sergiomendez.apicoches.entities.airconditioners.AirConditionerBuilder;
import es.sergiomendez.apicoches.entities.airconditioners.HVAC;
import es.sergiomendez.apicoches.entities.airconditioners.HVACBuilder;
import es.sergiomendez.apicoches.exceptions.AirConditionerTypeNotFoundException;
import es.sergiomendez.apicoches.exceptions.NullAirConditionerException;
import org.springframework.stereotype.Component;

@Component
public class AirConditionerFactory {

    private AirConditioner airConditioner;

    private AirConditionerFactory() {}

    public AirConditionerFactory(String type) throws AirConditionerTypeNotFoundException {
        switch (type) {
            case "estandar", "estándar", "standard" -> this.airConditioner = new AirConditionerBuilder("Aire Acondicionado por defecto")
                    .addPower(2000)
                    .build();
            case "climatizador", "hvac" -> this.airConditioner = new HVACBuilder("Climatizador por defecto")
                    .addPower(2000)
                    .build();
            default -> throw new AirConditionerTypeNotFoundException(type);
        }
    }

    public AirConditionerFactory(AirConditioner newAirConditioner) throws NullAirConditionerException {
        if (newAirConditioner instanceof HVAC) {
            this.airConditioner = new HVACBuilder(newAirConditioner.getName())
                    .addPower(newAirConditioner.getPower())
                    .build();
        } else if (newAirConditioner != null) {
            this.airConditioner = new AirConditionerBuilder(newAirConditioner.getName())
                    .addPower(newAirConditioner.getPower())
                    .build();
        } else {
            throw new NullAirConditionerException();
        }
    }

    public AirConditioner getAirConditioner() {
        return this.airConditioner;
    }
}

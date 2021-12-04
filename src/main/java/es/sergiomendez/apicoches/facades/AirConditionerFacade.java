package es.sergiomendez.apicoches.facades;

import es.sergiomendez.apicoches.entities.airconditioners.AirConditioner;
import es.sergiomendez.apicoches.exceptions.AirConditionerTypeNotFoundException;
import es.sergiomendez.apicoches.exceptions.NullAirConditionerException;
import es.sergiomendez.apicoches.factories.AirConditionerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AirConditionerFacade {

    @Autowired
    AirConditionerFactory factory;

    public AirConditioner createAirConditioner(String type) throws AirConditionerTypeNotFoundException {
        factory = new AirConditionerFactory(type);
        return factory.getAirConditioner();
    }

    public AirConditioner createAirConditioner(AirConditioner airConditioner) throws NullAirConditionerException {
        factory = new AirConditionerFactory(airConditioner);
        return factory.getAirConditioner();
    }
}

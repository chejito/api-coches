package es.sergiomendez.apicoches.facades;

import es.sergiomendez.apicoches.entities.batteries.Battery;
import es.sergiomendez.apicoches.exceptions.BatteryNotFoundException;
import es.sergiomendez.apicoches.exceptions.BatteryTypeNotFoundException;
import es.sergiomendez.apicoches.exceptions.NullBatteryException;
import es.sergiomendez.apicoches.factories.BatteryFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BatteryFacade {

    @Autowired
    BatteryFactory factory;

    public Battery createBattery(String type) throws BatteryTypeNotFoundException {
        factory = new BatteryFactory(type);
        return factory.getBattery();
    }

    public Battery createBattery(Battery battery) throws NullBatteryException {
        factory = new BatteryFactory(battery);
        return factory.getBattery();
    }
}

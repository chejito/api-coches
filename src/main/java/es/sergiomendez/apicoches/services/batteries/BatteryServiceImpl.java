package es.sergiomendez.apicoches.services.batteries;

import es.sergiomendez.apicoches.entities.batteries.Battery;
import es.sergiomendez.apicoches.exceptions.AirConditionerTypeNotFoundException;
import es.sergiomendez.apicoches.exceptions.BatteryTypeNotFoundException;
import es.sergiomendez.apicoches.exceptions.EngineTypeNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class BatteryServiceImpl implements BatteryService {

    @Autowired
    private BatteryFacade facade;

    public ArrayList<Battery> createBatteries(String...types) throws BatteryTypeNotFoundException {
        ArrayList<Battery> batterys = new ArrayList<>();

        for (String type : types) {
            Battery battery = createBattery(type);
            batterys.add(battery);
        }

        return batterys;
    }

    public Battery createBattery(String type) throws BatteryTypeNotFoundException {
        Battery battery;
        battery = facade.createBattery(type);

        return battery;
    }
}

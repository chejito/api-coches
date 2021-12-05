package es.sergiomendez.apicoches.services.batteries;

import es.sergiomendez.apicoches.entities.batteries.Battery;
import es.sergiomendez.apicoches.exceptions.AirConditionerTypeNotFoundException;
import es.sergiomendez.apicoches.exceptions.BatteryTypeNotFoundException;
import es.sergiomendez.apicoches.exceptions.EngineTypeNotFoundException;
import org.springframework.stereotype.Service;

@Service
public interface BatteryService {
    Battery createBattery(String type) throws BatteryTypeNotFoundException;
}

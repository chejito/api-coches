package es.sergiomendez.apicoches.services.airconditioners;

import es.sergiomendez.apicoches.entities.airconditioners.AirConditioner;
import es.sergiomendez.apicoches.exceptions.AirConditionerTypeNotFoundException;
import es.sergiomendez.apicoches.exceptions.BatteryTypeNotFoundException;
import es.sergiomendez.apicoches.exceptions.EngineTypeNotFoundException;
import org.springframework.stereotype.Service;

@Service
public interface AirConditionerService {
    AirConditioner createAirConditioner(String type) throws EngineTypeNotFoundException, AirConditionerTypeNotFoundException, BatteryTypeNotFoundException;
}

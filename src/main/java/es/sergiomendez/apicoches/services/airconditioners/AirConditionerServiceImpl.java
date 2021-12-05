package es.sergiomendez.apicoches.services.airconditioners;

import es.sergiomendez.apicoches.entities.airconditioners.AirConditioner;
import es.sergiomendez.apicoches.exceptions.AirConditionerTypeNotFoundException;
import es.sergiomendez.apicoches.exceptions.BatteryTypeNotFoundException;
import es.sergiomendez.apicoches.exceptions.EngineTypeNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class AirConditionerServiceImpl implements AirConditionerService {

    @Autowired
    private AirConditionerFacade facade;

    public ArrayList<AirConditioner> createAirConditioners(String...types) throws AirConditionerTypeNotFoundException, EngineTypeNotFoundException, AirConditionerTypeNotFoundException, BatteryTypeNotFoundException {
        ArrayList<AirConditioner> airConditioners = new ArrayList<>();

        for (String type : types) {
            AirConditioner airConditioner = createAirConditioner(type);
            airConditioners.add(airConditioner);
        }

        return airConditioners;
    }

    public AirConditioner createAirConditioner(String type) throws AirConditionerTypeNotFoundException, EngineTypeNotFoundException, AirConditionerTypeNotFoundException, BatteryTypeNotFoundException {
        AirConditioner airConditioner;
        airConditioner = facade.createAirConditioner(type);

        return airConditioner;
    }




}

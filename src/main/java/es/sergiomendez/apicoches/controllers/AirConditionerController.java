package es.sergiomendez.apicoches.controllers;

import es.sergiomendez.apicoches.entities.airconditioners.AirConditioner;
import es.sergiomendez.apicoches.entities.engines.Engine;
import es.sergiomendez.apicoches.facades.AirConditionerFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class AirConditionerController {

    @Autowired
    AirConditionerFacade airConditionerFacade;

    static ArrayList<AirConditioner> airConditioners = new ArrayList<>();


    public ArrayList<AirConditioner> createAirConditioners(String...tipos) {
        for (String tipo : tipos) {
            try {
                AirConditioner airConditioner = airConditionerFacade.createAirConditioner(tipo);
                airConditioners.add(airConditioner);
            } catch(Exception e) {
                System.err.println(e.getMessage());
            }
        }

        return airConditioners;
    }

}


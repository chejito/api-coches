package es.sergiomendez.apicoches.controllers;

import es.sergiomendez.apicoches.entities.batteries.Battery;
import es.sergiomendez.apicoches.entities.engines.Engine;
import es.sergiomendez.apicoches.facades.BatteryFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class BatteryController {

    @Autowired
    BatteryFacade batteryFacade;

    static ArrayList<Battery> batteries = new ArrayList<>();


    public ArrayList<Battery> createBatteries(String...tipos) {
        for (String tipo : tipos) {
            try {
                Battery battery = batteryFacade.createBattery(tipo);
                batteries.add(battery);
            } catch(Exception e) {
                System.err.println(e.getMessage());
            }
        }

        return batteries;
    }

}


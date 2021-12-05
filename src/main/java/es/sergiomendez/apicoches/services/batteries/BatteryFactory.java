package es.sergiomendez.apicoches.services.batteries;

import es.sergiomendez.apicoches.entities.batteries.Battery;
import es.sergiomendez.apicoches.entities.batteries.BatteryBuilder;
import es.sergiomendez.apicoches.entities.batteries.EngineBattery;
import es.sergiomendez.apicoches.entities.batteries.EngineBatteryBuilder;
import es.sergiomendez.apicoches.exceptions.BatteryNotFoundException;
import es.sergiomendez.apicoches.exceptions.BatteryTypeNotFoundException;
import es.sergiomendez.apicoches.exceptions.NullBatteryException;
import org.springframework.stereotype.Component;

@Component
public class BatteryFactory {

    private Battery battery;

    private BatteryFactory() {}

    public BatteryFactory(String type) throws BatteryTypeNotFoundException {
        switch (type) {
            case "arranque", "normal" -> this.battery = new BatteryBuilder("Batería de arranque por defecto")
                    .addVolts(12)
                    .addAh(5000)
                    .addStartStop(true)
                    .build();
            case "motriz", "motora" -> this.battery = new EngineBatteryBuilder("Batería para motor eléctrico por defecto")
                    .addVolts(12)
                    .addAh(50000)
                    .addStartStop(true)
                    .addReach(300)
                    .addType("Ión-Litio (LiCoO2)")
                    .addChargeCycles(1000)
                    .build();
            default -> throw new BatteryTypeNotFoundException(type);
        }
    }

    public BatteryFactory(Battery newBattery) throws NullBatteryException {
        if (newBattery instanceof EngineBattery) {
            this.battery = new EngineBatteryBuilder(newBattery.getName())
                    .addVolts(newBattery.getVolts())
                    .addAh(newBattery.getAh())
                    .addStartStop(newBattery.getStartStopCompatible())
                    .addReach(((EngineBattery) newBattery).getReach())
                    .addType(((EngineBattery) newBattery).getType())
                    .addChargeCycles(((EngineBattery) newBattery).getChargeCycles())
                    .build();
        } else if (newBattery != null) {
            this.battery = new BatteryBuilder(newBattery.getName())
                    .addVolts(newBattery.getVolts())
                    .addAh(newBattery.getAh())
                    .addStartStop(newBattery.getStartStopCompatible())
                    .build();
        } else {
            throw new NullBatteryException();
        }

    }

    public Battery getBattery() {
        return this.battery;
    }
}

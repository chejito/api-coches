//package es.sergiomendez.apicoches.controllers;
//
//import es.sergiomendez.apicoches.entities.batteries.Battery;
//import es.sergiomendez.apicoches.payload.BatteryResponse;
//import es.sergiomendez.apicoches.payload.messageResponse;
//import es.sergiomendez.apicoches.services.batteries.BatteryService;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//i
//
//@Component
//@Path("/batteries")
//public class BatteryController {
//
//    @Autowired
//    private BatteryService service;
//
//    Logger log = LoggerFactory.getLogger(BatteryController.class);
//
//    @GET
//    @Path("/type/{type}")
//    @Produces(APPLICATION_JSON)
//    public Response getBatteryByType(@PathParam("type") String type) {
//        try {
//            Battery battery = service.createBattery(type);
//            BatteryResponse batteryResponse = new BatteryResponse();
//            batteryResponse.setMessage("Batería de tipo '" + type + "' genérica creada");
//            batteryResponse.setBattery(battery);
//            log.warn("Batería creada: " + batteryResponse.getBattery().getName());
//
//            return Response.ok(batteryResponse).build();
//        } catch (Exception e) {
//            messageResponse messageResponse = new messageResponse();
//            messageResponse.setMessage(e.getMessage());
//            log.error(e.getMessage());
//
//            return Response.status(Response.Status.NOT_FOUND).entity(messageResponse).build();
//        }
//
//
//
//
//    }
//
//}
//

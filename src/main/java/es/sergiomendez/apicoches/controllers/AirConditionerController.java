//package es.sergiomendez.apicoches.controllers;
//
//import es.sergiomendez.apicoches.entities.airconditioners.AirConditioner;
//import es.sergiomendez.apicoches.payload.AirConditionerResponse;
//import es.sergiomendez.apicoches.payload.messageResponse;
//import es.sergiomendez.apicoches.services.airconditioners.AirConditionerService;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//
//
//@Component
//@Path("/airconditioners")
//public class AirConditionerController {
//
//    @Autowired
//    private AirConditionerService service;
//
//    Logger log = LoggerFactory.getLogger(AirConditionerController.class);
//
//    @GET
//    @Path("/type/{type}")
//    @Produces(APPLICATION_JSON)
//    public Response getAirConditionerByType(@PathParam("type") String type) {
//        try {
//            AirConditioner airConditioner = service.createAirConditioner(type);
//            AirConditionerResponse airConditionerResponse = new AirConditionerResponse();
//            airConditionerResponse.setMessage("Aire Acondicionado de tipo '" + type + "' genérico creado");
//            airConditionerResponse.setAirConditioner(airConditioner);
//            log.warn("Aire Acondicionado creado: " + airConditionerResponse.getAirConditioner().getName());
//
//            return Response.ok(airConditionerResponse).build();
//        } catch (Exception e) {
//            messageResponse messageResponse = new messageResponse();
//            messageResponse.setMessage(e.getMessage());
//            log.error(e.getMessage());
//
//            return Response.status(Response.Status.NOT_FOUND).entity(messageResponse).build();
//        }
//    }
//
//}
//

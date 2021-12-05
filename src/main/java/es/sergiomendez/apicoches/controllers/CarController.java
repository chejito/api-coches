//package es.sergiomendez.apicoches.controllers;
//
//import es.sergiomendez.apicoches.payload.CarResponse;
//import es.sergiomendez.apicoches.payload.messageResponse;
//import es.sergiomendez.apicoches.entities.cars.Car;
//import es.sergiomendez.apicoches.services.cars.CarService;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//
//
//@Component
//@Path("/cars")
//public class CarController {
//
//    @Autowired
//    private CarService service;
//
//    Logger log = LoggerFactory.getLogger(CarController.class);
//
//    @GET
//    @Path("/type/{type}")
//    @Produces(APPLICATION_JSON)
//    public Response getCarByType(@PathParam("type") String type) {
//        try {
//            Car car = service.createCar(type);
//            CarResponse carResponse = new CarResponse();
//            carResponse.setMessage("Coche de tipo '" + type + "' genérico creado");
//            carResponse.setCar(car);
//            log.warn("Coche creado: " + carResponse.getCar().getName());
//
//            return Response.ok(carResponse).build();
//        } catch (Exception e) {
//            messageResponse messageResponse = new messageResponse();
//            messageResponse.setMessage(e.getMessage());
//            log.error(e.getMessage());
//
//            return Response.status(Response.Status.NOT_FOUND).entity(messageResponse).build();
//        }
//    }
//
//
//}
//

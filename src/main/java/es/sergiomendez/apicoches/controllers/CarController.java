package es.sergiomendez.apicoches.controllers;

import es.sergiomendez.apicoches.dtos.CarDto;
import es.sergiomendez.apicoches.dtos.ErrorResponse;
import es.sergiomendez.apicoches.entities.cars.Car;
import es.sergiomendez.apicoches.services.cars.CarServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Component
@Path("/cars")
public class CarController {

    @Autowired
    private CarServiceImpl carService;

    @GET
    @Path("/type/{type}")
    @Produces(APPLICATION_JSON)
    public Response getCarByType(@PathParam("type") String type) {
        try {
            Car car = carService.createCar(type);
            CarDto carDto = new CarDto();
            carDto.setMessage("Coche "+ type + " genérico creado");
            carDto.setCar(car);

            return Response.ok().entity(carDto).build();
        } catch (Exception e) {
            ErrorResponse errorResponse = new ErrorResponse();
            errorResponse.setMessage(e.getMessage());

            return Response.status(Response.Status.NOT_FOUND).entity(errorResponse).build();
        }




    }


}


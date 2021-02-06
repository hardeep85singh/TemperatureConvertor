package com.temperatureConvertor.rest;

import com.temperatureConvertor.service.*;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/convert")
public class ConvertorRestApplication {

//    @Inject
    private TemperatureConvertorImp temperatureConvertor = new TemperatureConvertorImp();

    @GET
//    @Path("/convert")
    @Produces(MediaType.TEXT_HTML)
    public Response convert(@QueryParam("unit") String unit, @QueryParam("value") double temperature){
        if(unit.equals("C")){
            String cToF = Double.toString(temperatureConvertor.celsiusToFahrenheit(temperature));
            return Response.status(200).entity("Temperature in Fahrenheit: "+ cToF).build();
        } else if(unit.equals("F")){
            String fToC = Double.toString(temperatureConvertor.fahrenheitToCelsius(temperature));
            return Response.status(200).entity("Temperature in Celsius: " + fToC).build();
        } else {
            String response = "The parameters are not correct";
            return Response.status(200).entity(response).build();
        }
    }



}




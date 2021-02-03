package com.temperatureConvertor.rest;

import com.temperatureConvertor.service.*;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/convert")
public class ConvertorRestApplication {

    @Inject
    private TemperatureConvertorImp temperatureConvertor = new TemperatureConvertorImp();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response convert(@QueryParam("unit") String unit, @QueryParam("value") double temperature){
        if(unit.equals("celsius")){
            String cToF = Double.toString(temperatureConvertor.celsiusToFahrenheit(temperature));
            return Response.status(200).entity(cToF).build();
        } else if(unit.equals("fahrenheit")){
            String fToC = Double.toString(temperatureConvertor.fahrenheitToCelsius(temperature));
            return Response.status(200).entity(fToC).build();
        } 
        return null;
    }

}




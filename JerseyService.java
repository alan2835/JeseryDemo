package com.howtodoinjava.jersey;

import io.swagger.annotations.Api;
import io.swagger.annotations.Authorization;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/message")
@Api(value = "JerseyService", authorizations = {
      @Authorization(value="sampleoauth", scopes = {})
    })
public class JerseyService
{
    @GET
    public String getMsg()
    {
         return "Hello World !! - Jersey 2";
    }
}

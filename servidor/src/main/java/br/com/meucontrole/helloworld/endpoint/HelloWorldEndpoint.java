package br.com.meucontrole.helloworld.endpoint;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/hello")
public class HelloWorldEndpoint {

    @GET
    public String hello() {
        return "Hello World!";
    }
}

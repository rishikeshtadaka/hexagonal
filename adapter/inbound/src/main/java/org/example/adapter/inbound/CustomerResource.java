package org.example.adapter.inbound;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.example.port.inbound.CreateCustomerUsecase;

@Path("/customer")
public class CustomerResource {

    @Inject
    CreateCustomerUsecase createCustomerUsecase;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String create() {
        var customer = createCustomerUsecase.create();
        return "Customer created:"+ customer.getName();
    }
}

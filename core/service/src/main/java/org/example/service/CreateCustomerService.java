package org.example.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.example.domain.Customer;
import org.example.port.inbound.CreateCustomerUsecase;
import org.example.port.outbound.CustomerPort;

@ApplicationScoped
public class CreateCustomerService implements CreateCustomerUsecase {

    @Inject
    CustomerPort customerPort;

    @Override
    public Customer create() {
        var customer = new Customer(1, "Ramesh");
        customerPort.Save(customer);
        return customer;
    }
}

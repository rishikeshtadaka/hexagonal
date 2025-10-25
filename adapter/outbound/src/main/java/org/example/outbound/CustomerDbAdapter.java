package org.example.outbound;

import jakarta.enterprise.context.ApplicationScoped;
import org.example.domain.Customer;
import org.example.port.outbound.CustomerPort;

@ApplicationScoped
public class CustomerDbAdapter implements CustomerPort {
    @Override
    public void Save(Customer customer) {

    }
}

package org.example.port.outbound;

import jakarta.enterprise.context.ApplicationScoped;
import org.example.domain.Customer;

public interface CustomerPort {
    void Save(Customer customer);
}

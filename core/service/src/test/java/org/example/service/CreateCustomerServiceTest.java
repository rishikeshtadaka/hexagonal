package org.example.service;

import io.quarkus.test.InjectMock;
import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.example.port.inbound.CreateCustomerUsecase;
import org.example.port.outbound.CustomerPort;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class CreateCustomerServiceTest {

    @Mock
    CustomerPort customerPort;

    @InjectMocks
    CreateCustomerService service;

    @Test
    void testCreateCustomer() {
        var customer = service.create();
        assertSame("Ramesh", customer.getName());
    }
}
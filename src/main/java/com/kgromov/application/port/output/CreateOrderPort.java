package com.kgromov.application.port.output;

import com.kgromov.application.domain.model.Order;
import com.kgromov.application.port.input.OrderRequest;
import org.jmolecules.architecture.hexagonal.PrimaryPort;

@PrimaryPort
public interface CreateOrderPort {

    Order createOrder(OrderRequest orderRequest);
}

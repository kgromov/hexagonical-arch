package com.kgromov.application.port.output;

import com.kgromov.application.domain.model.Order;
import com.kgromov.application.port.input.OrderRequest;

public interface CreateOrderPort {

    Order createOrder(OrderRequest orderRequest);
}

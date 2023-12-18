package com.kgromov.application.port.output;

import com.kgromov.application.domain.model.Order;

public interface LoadOrderPort {

    Order loadOrder(String orderId);
}

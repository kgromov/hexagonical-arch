package com.kgromov.adapter.output.dao;

import com.kgromov.application.domain.model.Order;
import com.kgromov.application.port.input.OrderRequest;
import org.springframework.stereotype.Component;

// normally it should be mapping framework - e.g. MapStruct
@Component
public class OrderMapper {

    public Order mapFromOrderDao(OrderDao orderDao) {
        return Order.builder().build();
    }

    public OrderDao mapFromOrdeRequest(OrderRequest orderRequest) {
        return OrderDao.builder().build();
    }
}

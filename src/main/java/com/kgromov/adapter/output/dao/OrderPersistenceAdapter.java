package com.kgromov.adapter.output.dao;

import com.kgromov.application.domain.model.Order;
import com.kgromov.application.port.input.OrderRequest;
import com.kgromov.application.port.output.CreateOrderPort;
import com.kgromov.application.port.output.LoadOrderPort;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.text.MessageFormat;

@Service
@RequiredArgsConstructor
public class OrderPersistenceAdapter implements
        LoadOrderPort,
        CreateOrderPort {
    private final OrderRepository orderRepository;
    private final OrderMapper mapper;

    @Override
    public Order loadOrder(String orderId) {
        return orderRepository.findById(orderId)
                .map(mapper::mapFromOrderDao)
                .orElseThrow(() -> new EntityNotFoundException(MessageFormat.format("Order is not found by id = {0}", orderId)));
    }

    @Override
    public Order createOrder(OrderRequest orderRequest) {
        OrderDao newOrder = orderRepository.saveAndFlush(mapper.mapFromOrdeRequest(orderRequest));
        return mapper.mapFromOrderDao(newOrder);
    }
}

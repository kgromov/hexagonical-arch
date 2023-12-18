package com.kgromov.application.domain.service;

import com.kgromov.application.domain.model.Order;
import com.kgromov.application.port.input.OrderProductUseCase;
import com.kgromov.application.port.input.OrderRequest;
import com.kgromov.application.port.output.CreateOrderPort;
import com.kgromov.application.port.output.ProductInventoryPort;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderProductService implements OrderProductUseCase {
    private ProductInventoryPort productInventoryPort;
    private CreateOrderPort createOrderPort;

    @Override
    public Optional<String> bookNewOrder(OrderRequest orderRequest) {
        boolean allProductsAreAvailable = orderRequest.getOrderItems()
                .stream()
                .noneMatch(item -> !productInventoryPort.canOrderProduct(item.getProductId(), item.getQuantity()));
        if (!allProductsAreAvailable) {
            return Optional.empty();
        }
        return Optional.of(createOrderPort.createOrder(orderRequest))
                .map(Order::getOrderId);
    }
}

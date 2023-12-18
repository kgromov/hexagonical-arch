package com.kgromov.application.domain.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
public class Order {
    private String orderId;
    private OrderStatus status;
    private LocalDateTime orderDate;
    private String clientId;
    private List<OrderItem> orderItems;
}

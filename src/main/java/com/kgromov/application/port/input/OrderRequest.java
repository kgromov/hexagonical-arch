package com.kgromov.application.port.input;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
public class OrderRequest {
    private String clientId;
    private List<OrderItemRequest> orderItems;
}

package com.kgromov.application.port.input;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
public class OrderItemRequest {
    private String productId;
    private short quantity;
}

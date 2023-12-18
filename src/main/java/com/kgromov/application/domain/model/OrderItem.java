
package com.kgromov.application.domain.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
public class OrderItem {
    private String productId;
    private short quantity;
    private BigDecimal price;
}

package com.kgromov.application.domain.model;

import lombok.*;

import java.math.BigDecimal;

@Data
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
public class Product {
    private String id;
    private String name;
    private String description;
    private BigDecimal price;
}

package com.kgromov.application.port.output;

public interface ProductInventoryPort {
    boolean canOrderProduct(String productId, short quantity);
}

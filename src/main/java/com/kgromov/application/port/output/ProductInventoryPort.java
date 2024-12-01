package com.kgromov.application.port.output;

import org.jmolecules.architecture.hexagonal.PrimaryPort;

@PrimaryPort
public interface ProductInventoryPort {
    boolean canOrderProduct(String productId, short quantity);
}

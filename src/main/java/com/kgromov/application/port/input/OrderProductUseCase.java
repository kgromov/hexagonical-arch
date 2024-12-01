package com.kgromov.application.port.input;

import org.jmolecules.architecture.hexagonal.Port;

import java.util.Optional;

@Port
public interface OrderProductUseCase {

    Optional<String> bookNewOrder(OrderRequest orderRequest);
}

package com.kgromov.application.port.input;

import java.util.Optional;

public interface OrderProductUseCase {

    Optional<String> bookNewOrder(OrderRequest orderRequest);
}

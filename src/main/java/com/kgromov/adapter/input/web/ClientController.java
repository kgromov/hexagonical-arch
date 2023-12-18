package com.kgromov.adapter.input.web;

import com.kgromov.application.port.input.OrderProductUseCase;
import com.kgromov.application.port.input.OrderRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customers")
@RequiredArgsConstructor
public class ClientController {
    private final OrderProductUseCase orderProductUseCase;

    @PostMapping("/{clientId}")
    private String createNewOrder(@PathVariable("clientId") String clientId,
                                  @RequestBody OrderRequest orderRequest) {
        return orderProductUseCase.bookNewOrder(orderRequest)
                .orElseThrow(() -> new RuntimeException("Order was not created"));
    }
}

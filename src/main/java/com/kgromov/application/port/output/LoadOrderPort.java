package com.kgromov.application.port.output;

import com.kgromov.application.domain.model.Order;
import org.jmolecules.architecture.hexagonal.PrimaryPort;

@PrimaryPort
public interface LoadOrderPort {

    Order loadOrder(String orderId);
}

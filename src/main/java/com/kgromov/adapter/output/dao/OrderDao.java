package com.kgromov.adapter.output.dao;

import com.kgromov.application.domain.model.OrderStatus;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "order")
@Data
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
public class OrderDao {
    @Id
    @GeneratedValue
    private UUID id;
    @ManyToOne
    private ClientDao client;
    private OrderStatus status;
    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<OrderItemDao> orderItems ;
}

package com.kgromov.adapter.output.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

interface OrderRepository extends JpaRepository<OrderDao, String> {
}

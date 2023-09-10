package com.yohanaff.github.orderservice.repository;

import com.yohanaff.github.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}

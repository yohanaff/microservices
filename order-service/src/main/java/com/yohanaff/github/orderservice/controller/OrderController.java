package com.yohanaff.github.orderservice.controller;

import com.yohanaff.github.orderservice.dto.OrderRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/order")
public class OrderController {

    @PostMapping
    public String placeOrder(OrderRequest orderRequest) {
        return "Order placed successfully";
    }
}

package com.dependencyInjection.services;

import com.dependencyInjection.entiry.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    private ShippingService shippingService;

    public double total(Order order) {
        return order.getBase() - (order.getBase() * (order.getDiscount() / 100)) + shippingService.shipment(order);
    }
}

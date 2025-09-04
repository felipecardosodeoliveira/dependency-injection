package com.dependencyInjection.services;

import com.dependencyInjection.entiry.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {
    public double shipment(Order order) {
        if (order.getBase() < 100) {
            return 20;
        } else if (order.getBase() >= 100 && order.getBase() < 200) {
            return 12;
        }
        return 0;
    }
}

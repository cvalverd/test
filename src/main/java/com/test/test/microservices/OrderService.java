package com.test.test.microservices;

public class OrderService {
    public double calculateTotal(Order order) {
        return order.getItems().stream()
                .mapToDouble(Item::getPrecio)
                .sum();
    }
}
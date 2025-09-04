package com.dependencyInjection.entiry;

public class Order {
    private final int code;
    private final double base;
    private final double discount;

    public Order(int code, double base, double discount) {
        this.code = code;
        this.base = base;
        this.discount = discount;
    }

    public int getCode() {
        return code;
    }

    public double getBase() {
        return base;
    }

    public double getDiscount() {
        return discount;
    }
}

package com.ms.java.design.pattern.introduction_to_design_patterns.design_principles.encapsulate;

import java.util.List;

public class Order {
    // Fields
    private String country;
    private final TaxCalculator taxCalculator;
    private final List<Item> items;

    // Constructor
    public Order(String _country, TaxCalculator _taxCalculator, List<Item> _items) {
        this.country = _country;
        this.taxCalculator = _taxCalculator;
        this.items = _items;
    }
    
    // Method
    public Double getOrderTotal() {
        Double total = 0.0;
        
        for (Item item : items) {
            Double subtotal = item.getPrice() * item.getQty();
            total += subtotal * this.taxCalculator.getTaxRate(this.country);
            System.out.println("TOTAL: " + total);
        }
        
        return total;
    }
}

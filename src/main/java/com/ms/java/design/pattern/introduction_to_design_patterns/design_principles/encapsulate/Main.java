package com.ms.java.design.pattern.introduction_to_design_patterns.design_principles.encapsulate;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Instantiate objects
        TaxCalculator taxCalculator = new TaxCalculator();
        
        Item computer = new Item(1L, "Computer", 1000.0, 1.0);
        Item phone = new Item(1L, "Phone", 2000.0, 2.0);
        Item tv = new Item(1L, "TV", 3000.0, 1.0);
        List<Item> items = new ArrayList<>();
        items.add(computer);
        items.add(phone);
        items.add(tv);
        
        Order order = new Order("US", taxCalculator, items);
        System.out.println("Total price: " + order.getOrderTotal());
    }
}

package com.ms.java.design.pattern.introduction_to_design_patterns.design_principles.encapsulate;

public class Item {
    // Fields
    private Long id;
    private String name;
    private Double price;
    private Double qty;

    // Constructor
    public Item(Long _id, String _name, Double _price, Double _qty) {
        this.id = _id;
        this.name = _name;
        this.price = _price;
        this.qty = _qty;
    }

    // Getters
    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Double getPrice() {
        return this.price;
    }

    public Double getQty() {
        return this.qty;
    }
}

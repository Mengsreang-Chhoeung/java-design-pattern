package com.ms.java.design.pattern.introduction_to_oop.relations_between_objects.dependency;

public class Salary {
    // Fields
    private Double amount;
    private String currency;
    
    // Getters
    public Double getAmount() {
        return this.amount;
    }
    
    public String getCurrency() {
        return this.currency;
    }
    
    // Setters
    public void setAmount(Double _amount) {
        this.amount = _amount;
    }
    
    public void setCurrency(String _currency) {
        this.currency = _currency;
    }
}

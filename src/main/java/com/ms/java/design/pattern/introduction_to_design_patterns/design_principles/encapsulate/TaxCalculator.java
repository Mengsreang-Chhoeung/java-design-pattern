package com.ms.java.design.pattern.introduction_to_design_patterns.design_principles.encapsulate;

public class TaxCalculator {
    // Methods
    public Double getTaxRate(String country) {
        return switch (country) {
            case "US" -> this.getUSTax();
            case "EU" -> this.getEUTax();
            default -> 0.0;
        };
    }
    
    private Double getUSTax() {
        return 0.07;
    }
    
    private Double getEUTax() {
        return 0.20;
    }
}

package com.ms.java.design.pattern.introduction_to_design_patterns.design_principles.favor_composition;

public class Transport {
    private final Engine engine;
    private final Driver driver;

    public Transport() {
        this.engine = new CombustionEngine();
        this.driver = new Robot();
    }
    
    public void deliver(String destination, String to) {
        this.engine.move();
        this.driver.navigate();
        System.out.println("Start transporting from " + destination + " to " + to + ".");
    }
}

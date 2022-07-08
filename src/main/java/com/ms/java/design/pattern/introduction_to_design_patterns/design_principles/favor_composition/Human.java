package com.ms.java.design.pattern.introduction_to_design_patterns.design_principles.favor_composition;

public class Human implements Driver {

    @Override
    public void navigate() {
        System.out.println("Human navigated.");
    }
    
}

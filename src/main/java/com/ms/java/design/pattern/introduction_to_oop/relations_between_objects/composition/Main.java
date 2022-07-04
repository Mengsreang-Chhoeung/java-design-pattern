package com.ms.java.design.pattern.introduction_to_oop.relations_between_objects.composition;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Instantiate objects
        Department computerScience = new Department(1L, "Computer Science");
        Department network = new Department(2L, "Network");
        Department media = new Department(3L, "Media");
        List<Department> departments = new ArrayList<>();
        departments.add(computerScience);
        departments.add(network);
        departments.add(media);
        
        University rupp = new University("RUPP", departments);
        rupp.getUniversityInfo();
    }
}

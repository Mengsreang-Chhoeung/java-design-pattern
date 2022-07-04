package com.ms.java.design.pattern.introduction_to_oop.relations_between_objects.aggregation;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Instantiate objects
        Professor c = new Professor(1L, "Kok Koko", "C Program");
        Professor cpp = new Professor(2L, "Kok Dara", "C++");
        Professor java = new Professor(3L, "Kok Kanha", "Java");
        List<Professor> professor = new ArrayList<>();
        professor.add(c);
        professor.add(cpp);
        professor.add(java);
        
        Department department = new Department(1L, "Computer Science", professor);
        department.getDepartmentInfo();
    }
}

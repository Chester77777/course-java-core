package com.rakovets.course.java.core.example.oop.classesandobjects;

import com.rakovets.course.java.core.example.oop.classesandobjects.model.Car;

public class Example5GettersAndSetters {
    public static void main(String[] args) {
        Car bmw = new Car("X7", 2019);
        System.out.printf("Car model: %s.\n", bmw.getModel());
        System.out.printf("Car year: %d.\n", bmw.getYear());
    }
}

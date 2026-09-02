package com.Oops;

class Vehicle {
    void start() {
        System.out.println("Parent Called ");
    }
}

public class Car extends Vehicle {
    void drive() {
        System.out.println("Child called ");
    }
    public static void main(String[] args) {
        Car c = new Car();
        c.drive();
        
        c.start();
    }
}


package com.basics.tc;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.drive();
    }
}

/*
Main -> new Car() -> Car constructor -> new Engine -> drive() -> start()

Engine is created by the Car class
Not main

Problem if we have to replace the engine we'll have to harcode modify the car

Testing will be difficult because we cant place a fake engine there

Tight coupling : One class is dependent on another class
 */

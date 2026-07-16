package com.basics2.better;

public class Car {
    private VehicleEngine engine;

    public Car(VehicleEngine engine) {
        this.engine = engine;
    }

    public void drive() {
        engine.start();
        System.out.println("Car started");
    }
}

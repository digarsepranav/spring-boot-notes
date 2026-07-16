package com.basics2.better;

public class Main {
    public static void main(String[] args) {
        VehicleEngine engine = new ElectricEngine();
        Car car = new Car(engine);
        car.drive();
    }
}

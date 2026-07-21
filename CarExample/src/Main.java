public class Main {
    public static void main(String[] args) {
        Engine engine = new ElectricEngine();
        Car car = new Car(engine);
        car.whichEngine("Electric");

        Engine engine2 = new PetrolEngine();
        Car car2 = new Car(engine2);
        car2.whichEngine("Petrol");
    }
}

public class Car {
    private final Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void whichEngine(String s) {
        System.out.println("The engine started is : " + s + " Engine!");
    }
}

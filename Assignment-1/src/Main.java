public class Main {
    public static void main(String[] args) {
        PlainProcessor plainProcessor = new PlainProcessor();
        try {
            double result = plainProcessor.divide(10, 3);
            System.out.println(result);
        }
        catch (DivisionException e) {
            System.out.println("Caught exception : " + e.getMessage());
        }
    }
}

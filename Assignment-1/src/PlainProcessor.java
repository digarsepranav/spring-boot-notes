public class PlainProcessor {
    public double divide(double a, double b) throws DivisionException {
        System.out.println("Process Has Started");

        try {
            return a / b;
        }
        catch (ArithmeticException e) {
            System.out.println("Error! Cant divide by 0");
            throw new DivisionException("Error! Division by 0 is not allowed!");
        }
    }
}

// to access the exception created by us use throw new and the class name with the name of the class

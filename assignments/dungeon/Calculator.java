public class Calculator {

    public void divide(int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero!");
        }
    }
}

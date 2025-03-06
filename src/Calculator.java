package src;

public class Calculator {

    /**
     * Adds two integers and returns the result.
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Subtracts the second integer from the first and returns the result.
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Multiplies two integers and returns the result.
     */
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Divides the first integer by the second.
     * If the divisor is zero, throws an IllegalArgumentException.
     */
    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisor cannot be zero.");
        }
        return a / b;
    }

    /**
     * Returns the maximum of two integers.
     */
    public int max(int a, int b) {
        return a >= b ? a : b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Add: " + calc.add(5, 3));
        System.out.println("Subtract: " + calc.subtract(10, 4));
        System.out.println("Multiply: " + calc.multiply(2, 3));
        System.out.println("Divide: " + calc.divide(10, 2));
        System.out.println("Max: " + calc.max(7, 9));
    }
}

package test;

import static org.junit.Assert.*;

import org.junit.Test;

import src.Calculator;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        assertEquals("5 + 3 should equal 8", 8, calc.add(5, 3));
        assertEquals("0 + 0 should equal 0", 0, calc.add(0, 0));
    }

    @Test
    public void testSubtract() {
        Calculator calc = new Calculator();
        assertEquals("10 - 4 should equal 6", 6, calc.subtract(10, 4));
        assertEquals("5 - 10 should equal -5", -5, calc.subtract(5, 10));
    }

    @Test
    public void testMultiply() {
        Calculator calc = new Calculator();
        assertEquals("2 * 3 should equal 6", 6, calc.multiply(2, 3));
        assertEquals("0 * 10 should equal 0", 0, calc.multiply(0, 10));
    }

    @Test
    public void testDivide() {
        Calculator calc = new Calculator();
        assertEquals("10 / 2 should equal 5", 5, calc.divide(10, 2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        Calculator calc = new Calculator();
        calc.divide(10, 0);
    }

    @Test
    public void testMax() {
        Calculator calc = new Calculator();
        assertEquals("max of 7 and 9 should be 9", 9, calc.max(7, 9));
        assertEquals("max of 10 and 5 should be 10", 10, calc.max(10, 5));
        // Also test equal numbers.
        assertEquals("max of 4 and 4 should be 4", 4, calc.max(4, 4));
    }
}

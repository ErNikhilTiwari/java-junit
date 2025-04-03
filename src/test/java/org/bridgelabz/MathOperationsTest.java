package org.bridgelabz;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MathOperationsTest {
    MathOperations mathOperations = new MathOperations();

    @Test
    public void testDivide() {
        assertEquals(2, mathOperations.divide(6, 3));
        assertEquals(-2, mathOperations.divide(-6, 3));
    }

    @Test
    public void testDivideByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            mathOperations.divide(5, 0);
        });
        assertEquals("Cannot divide by zero", exception.getMessage());
    }
}

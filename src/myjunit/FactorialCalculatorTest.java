package myjunit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class FactorialCalculatorTest {

    // Test case for valid inputs
    @Test
    void testFactorialValidInput() {
        assertEquals(1, FactorialCalculator.factorial(0), "Factorial of 0 should be 1");
        assertEquals(1, FactorialCalculator.factorial(1), "Factorial of 1 should be 1");
        assertEquals(120, FactorialCalculator.factorial(5), "Factorial of 5 should be 120");
        assertEquals(3628800, FactorialCalculator.factorial(10), "Factorial of 10 should be 3,628,800");
    }

    // Test case for invalid inputs (negative numbers)
    @Test
    void testFactorialNegativeInput() {
        assertThrows(IllegalArgumentException.class, () -> {
            FactorialCalculator.factorial(-1);
        }, "Factorial of a negative number should throw IllegalArgumentException");

        assertThrows(IllegalArgumentException.class, () -> {
            FactorialCalculator.factorial(-10);
        }, "Factorial of a negative number should throw IllegalArgumentException");
    }
}

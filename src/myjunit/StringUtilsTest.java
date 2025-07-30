package myjunit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class StringUtilsTest {

    // Test case for null input
    @Test
    void testReverseStringNullInput() {
        // Assert that the method throws an IllegalArgumentException when input is null
        assertThrows(IllegalArgumentException.class, () -> {
            StringUtils.reverseString(null);
        }, "Input cannot be null");
    }

    // Test case for empty string
    @Test
    void testReverseStringEmptyString() {
        // Assert that the reversed string of an empty string is also an empty string
        assertEquals("", StringUtils.reverseString(""), "Reversing an empty string should return an empty string");
    }

    // Test case for a regular string
    @Test
    void testReverseStringRegularString() {
        // Assert that the reversed string of "hello" is "olleh"
        assertEquals("olleh", StringUtils.reverseString("hello"), "Reversed string of 'hello' should be 'olleh'");

        // Assert that the reversed string of "Java" is "avaJ"
        assertEquals("avaJ", StringUtils.reverseString("Java"), "Reversed string of 'Java' should be 'avaJ'");
    }
}

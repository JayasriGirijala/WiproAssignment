package myjunit;
public class StringUtils {
    public static String reverseString(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input cannot be null");
        }
        StringBuilder reversed = new StringBuilder(input);
        return reversed.reverse().toString();
    }
}

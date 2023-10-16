package classes;


import org.junit.Test;

/**
 * This class contains JUnit tests for the UInteger class.
 * UInteger is an unsigned integer class that provides methods for performing arithmetic operations on unsigned integers.
 * The tests include creating an instance of UInteger, getting the value of UInteger, adding two UInteger values,
 * subtracting two UInteger values, multiplying two UInteger values, dividing two UInteger values, comparing two UInteger values,
 * and testing the looping behavior of UInteger when adding or subtracting values beyond the maximum or minimum limit.
 * @author Olek Golus
 * @version 1.0
 * @see UInteger
 * @see Test
 */
public class UIntegerTest {

    @Test
    public void creatingInstanceOfUIntegerShouldNotThrowException() {
        UInteger number = UInteger.valueOf(1);
    }

    @Test (expected = IllegalArgumentException.class)
    public void creatingInstanceOfUIntegerWithNegativeValueShouldThrowException() {
        UInteger number = UInteger.valueOf(-1);
    }

    @Test
    public void gettingValueShouldReturnCorrectValue() {
        final long value = 1;
        UInteger number = UInteger.valueOf(value);
        assert number.getValue() == value;
    }

    @Test
    public void addingTwoNumbersShouldReturnCorrectValue() {
        final long value = 1;
        final long value2 = 2;
        final long expectedValue = 3;
        UInteger number = UInteger.valueOf(value);
        UInteger number2 = UInteger.valueOf(value2);
        number.add(number2);
        assert number.getValue() == expectedValue;
    }

    @Test
    public void subtractingTwoNumbersShouldReturnCorrectValue() {
        final long value = 1;
        final long value2 = 2;
        final long expectedValue = UInteger.MAX_VALUE;
        UInteger number = UInteger.valueOf(value);
        UInteger number2 = UInteger.valueOf(value2);
        number.subtract(number2);
        System.out.println(number.getValue());
        System.out.println(expectedValue);
        assert number.getValue() == expectedValue;
    }

    @Test
    public void multiplyingTwoNumbersShouldReturnCorrectValue() {
        final long value = 1;
        final long value2 = 2;
        final long expectedValue = 2;
        UInteger number = UInteger.valueOf(value);
        UInteger number2 = UInteger.valueOf(value2);
        number.multiply(number2);
        assert number.getValue() == expectedValue;
    }

    @Test
    public void dividingTwoNumbersShouldReturnCorrectValue() {
        final long value = 1;
        final long value2 = 2;
        final long expectedValue = 0;
        UInteger number = UInteger.valueOf(value);
        UInteger number2 = UInteger.valueOf(value2);
        number.divide(number2);
        assert number.getValue() == expectedValue;
    }

    @Test
    public void comparingTwoNumbersShouldReturnCorrectValue() {
        final long value = 1;
        final long value2 = 2;
        final int expectedValue = -1;
        UInteger number = UInteger.valueOf(value);
        UInteger number2 = UInteger.valueOf(value2);
        assert number.compareTo(number2) == expectedValue;
    }

    @Test
    public void addingValueAboveLimitShouldLoopTheValue() {
        final long value = UInteger.MAX_VALUE;
        final long value2 = 1;
        final long expectedValue = 0;
        UInteger number = UInteger.valueOf(value);
        UInteger number2 = UInteger.valueOf(value2);
        number.add(number2);
        assert number.getValue() == expectedValue;
    }

    @Test
    public void subtractingValueBelowLimitShouldLoopTheValue() {
        final long value = 0;
        final long value2 = 1;
        final long expectedValue = UInteger.MAX_VALUE;
        UInteger number = UInteger.valueOf(value);
        UInteger number2 = UInteger.valueOf(value2);
        number.subtract(number2);
        assert number.getValue() == expectedValue;
    }
}
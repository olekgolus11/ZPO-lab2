package classes;

import interfaces.IUInteger;

/**
 * This class represents an unsigned integer. It provides methods for performing arithmetic operations on unsigned integers.
 * @author Olek
 * @version 1.0
 * @see IUInteger
 *
 */
public class UInteger implements IUInteger, Comparable<UInteger> {
    public static long MAX_VALUE;
    public static long MIN_VALUE;
    private long value;

    /**
     * @param value initial value of the unsigned integer. The value must be greater than or equal to 0. Otherwise, an IllegalArgumentException is thrown.
     */
    public UInteger(long value) {
        this.value = value;
        MAX_VALUE = (long) (Math.pow(2, 32) - 1);
        MIN_VALUE = (long) (- Math.pow(2, 32));
    }


    @Override
    public long getValue() {
        return this.value;
    }

    @Override
    public IUInteger add(IUInteger other) {
        this.value += other.getValue();
        this.loopValueIfNeeded();
        return this;
    }

    @Override
    public IUInteger subtract(IUInteger other) {
        this.value -= other.getValue();
        this.loopValueIfNeeded();
        return this;
    }

    @Override
    public IUInteger multiply(IUInteger other) {
        this.value *= other.getValue();
        this.loopValueIfNeeded();
        return this;
    }

    @Override
    public IUInteger divide(IUInteger other) {
        this.value /= other.getValue();
        this.loopValueIfNeeded();
        return this;
    }

    /**
     * Compares this unsigned integer with the other unsigned integer.
     *
     * @param o the object to be compared. It must be an instance of UInteger. Otherwise, a ClassCastException is thrown.
     * @return 0 if the values of the two unsigned integers are equal, 1 if the value of this unsigned integer is greater than the value of the other unsigned integer, -1 if the value of this unsigned integer is less than the value of the other unsigned integer
     */
    @Override
    public int compareTo(UInteger o) {
        return Long.compare(this.value, o.getValue());
    }

    /**
     * Creates an unsigned integer with the value of the long value.
     *
     * @param i the long value to be converted to an unsigned integer
     * @return an unsigned integer with the value of the long value
     */
    public static UInteger valueOf(long i) {
        checkIfNumberInitializedWithNegativeValue(i);
        return new UInteger(i);
    }

    /**
     * Creates an unsigned integer with the value of the string.
     *
     * @param s the string to be converted to an unsigned integer
     * @return an unsigned integer with the value of the string
     */
    public static UInteger valueOf(String s) {
        int i = Integer.parseInt(s);
        checkIfNumberInitializedWithNegativeValue(i);
        return new UInteger(i);
    }

    /**
     * Checks if the value on creating an instance with is less than 0. If it is, an IllegalArgumentException is thrown.
     *
     * @param value the value to be checked
     * @throws IllegalArgumentException if the value is less than 0
     */
    private static void checkIfNumberInitializedWithNegativeValue(long value) throws IllegalArgumentException {
        if (value < 0) {
            throw new IllegalArgumentException("Initial number cannot be negative");
        }
    }

    /**
     * Loops the value of the unsigned integer if it is greater than the maximum value or less than the minimum value.
     */
    private void loopValueIfNeeded() {
        if (this.value > MAX_VALUE) {
            this.value = this.value - MAX_VALUE - 1;
        } else
        if (this.value < 0) {
            this.value = this.value - MIN_VALUE;
        }
    }
}

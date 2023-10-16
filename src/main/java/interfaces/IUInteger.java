package interfaces;

import classes.UInteger;

public interface IUInteger {
    /**
     * @return the value of the unsigned integer
     */
    long getValue();

    /**
     * Adds the other unsigned integer to this unsigned integer.
     *
     * @param other the other unsigned integer to add to this unsigned integer
     * @return this unsigned integer after adding the other unsigned integer to it
     */
    IUInteger add(IUInteger other);

    /**
     * Subtracts the other unsigned integer from this unsigned integer.
     *
     * @param other the other unsigned integer to subtract from this unsigned integer
     * @return this unsigned integer after subtracting the other unsigned integer from it
     */
    IUInteger subtract(IUInteger other);

    /**
     * Multiplies this unsigned integer by the other unsigned integer.
     *
     * @param other the other unsigned integer to multiply this unsigned integer by
     * @return this unsigned integer after multiplying it by the other unsigned integer
     */
    IUInteger multiply(IUInteger other);

    /**
     * Divides this unsigned integer by the other unsigned integer.
     *
     * @param other the other unsigned integer to divide this unsigned integer by
     * @return this unsigned integer after dividing it by the other unsigned integer
     */
    IUInteger divide(IUInteger other);

    String toString();
}

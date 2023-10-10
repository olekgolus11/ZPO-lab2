package classes;

import interfaces.IUInteger;

public class UInteger implements IUInteger {
    private long value;

    public UInteger(int value) {
        this.value = value;
    }

    @Override
    public long getValue() {
        return this.value;
    }

    @Override
    public IUInteger add(IUInteger other) {
        this.value += other.getValue();
        return this;
    }

    @Override
    public IUInteger subtract(IUInteger other) {
        this.value -= other.getValue();
        return this;
    }

    @Override
    public IUInteger multiply(IUInteger other) {
        this.value *= other.getValue();
        return this;
    }

    @Override
    public IUInteger divide(IUInteger other) {
        this.value /= other.getValue();
        return this;
    }

    public static UInteger valueOf(int i) {
        checkIfNumberInitializedWithNegativeValue(i);
        return new UInteger(i);
    }

    public static UInteger valueOf(String s) {
        int i = Integer.parseInt(s);
        checkIfNumberInitializedWithNegativeValue(i);
        return new UInteger(i);
    }

    private static void checkIfNumberInitializedWithNegativeValue(int value) throws IllegalArgumentException {
        if (value < 0) {
            throw new IllegalArgumentException("Initial number cannot be negative");
        }
    }
}

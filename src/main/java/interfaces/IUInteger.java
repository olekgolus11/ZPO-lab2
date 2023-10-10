package interfaces;

import classes.UInteger;

public interface IUInteger {
    long getValue();

    IUInteger add(IUInteger other);

    IUInteger subtract(IUInteger other);

    IUInteger multiply(IUInteger other);

    IUInteger divide(IUInteger other);

    String toString();
}

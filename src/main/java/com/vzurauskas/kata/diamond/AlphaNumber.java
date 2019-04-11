package com.vzurauskas.kata.diamond;

public final class AlphaNumber extends Number {

    private static final long serialVersionUID = -9091504105220860528L;

    private final char letter;

    public AlphaNumber(char letter) {
        super();
        this.letter = letter;
    }

    @Override
    public int intValue() {
        return letter - 64;
    }

    @Override
    public long longValue() {
        return (long) intValue();
    }

    @Override
    public float floatValue() {
        return (float) intValue();
    }

    @Override
    public double doubleValue() {
        return (double) intValue();
    }
}

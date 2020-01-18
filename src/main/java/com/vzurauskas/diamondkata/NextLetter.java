package com.vzurauskas.diamondkata;

public final class NextLetter implements Letter {
    private final Letter prev;

    public NextLetter(Letter prev) {
        this.prev = prev;
    }

    @Override
    public char value() {
        return (char) (prev.value() + (char) 1);
    }
}

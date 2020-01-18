package com.vzurauskas.diamondkata;

public final class A implements Letter {
    @Override
    public Letter next() {
        return new NextLetter(this);
    }

    @Override
    public char value() {
        return 'A';
    }
}

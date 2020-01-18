package com.vzurauskas.diamondkata;

public final class NormalLine implements Line {

    private final Letter letter;
    private final String padding;
    private final String middle;

    public NormalLine(Letter letter) {
        this(letter, "", " ");
    }

    private NormalLine(Letter letter, String padding, String middle) {
        this.letter = letter;
        this.padding = padding;
        this.middle = middle;
    }

    @Override
    public NormalLine pushed() {
        return new NormalLine(letter, padding + " ", middle);
    }

    @Override
    public NormalLine pulled() {
        return new NormalLine(letter.next(), padding, middle + "  ");
    }

    @Override
    public String value() {
        return padding + letter.value() + middle + letter.value() + '\n';
    }
}

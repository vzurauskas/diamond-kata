package com.vzurauskas.diamondkata;

public final class ALine implements Line {

    private final String padding;

    public ALine() {
        this("");
    }

    private ALine(String padding) {
        this.padding = padding;
    }

    @Override
    public Line pushed() {
        return new ALine(padding + " ");
    }

    @Override
    public Line pulled() {
        return new NormalLine(new A().next());
    }

    @Override
    public String value() {
        return padding + "A\n";
    }
}

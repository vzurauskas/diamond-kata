package com.vzurauskas.diamondkata;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public final class Full {

    private final Diamond diamond;

    public Full(char c) {
        this(diamond(c));
    }

    private static Diamond diamond(char c) {
        Diamond d = new ADiamond();
        for (int i = 0; i < c - 'A'; i++) {
            d = d.larger();
        }
        return d;
    }

    public Full(Diamond diamond) {
        this.diamond = diamond;
    }

    public String printed() {
        return Stream.concat(
            Stream.concat(
                diamond.top(),
                diamond.middle()
            ), diamond.bottom()
        )
            .map(Line::value)
            .collect(Collectors.joining());
    }
}

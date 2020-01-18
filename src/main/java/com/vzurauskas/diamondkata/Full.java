package com.vzurauskas.diamondkata;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public final class Full {

    private final Diamond diamond;

    public Full(char target) {
        this.diamond = diamond(new A(), new ADiamond(), target);
    }

    private static Diamond diamond(Letter letter, Diamond diamond, int target) {
        return letter.value() == target
            ? diamond
            : diamond(letter.next(), diamond.larger(), target);
    }

    public String printed() {
        return Stream.of(diamond.top(), diamond.middle(), diamond.bottom())
            .flatMap(lines -> lines)
            .map(Line::value)
            .collect(Collectors.joining());
    }
}

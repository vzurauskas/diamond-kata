package com.vzurauskas.diamondkata;

import java.util.stream.Stream;

public final class Larger implements Diamond {
    private final Diamond smaller;
    private final Letter letter;

    public Larger(Diamond smaller, Letter letter) {
        this.smaller = smaller;
        this.letter = letter;
    }

    @Override
    public Diamond larger() {
        return new Larger(this, new NextLetter(letter));
    }

    @Override
    public Stream<Line> top() {
        return Stream.concat(smaller.top(), smaller.middle())
            .map(Line::pushed);
    }

    @Override
    public Stream<Line> middle() {
        return smaller.middle().map(Line::pulled);
    }

    @Override
    public Stream<Line> bottom() {
        return Stream.concat(smaller.middle(), smaller.bottom())
            .map(Line::pushed);
    }
}

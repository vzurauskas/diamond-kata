package com.vzurauskas.diamondkata;

import java.util.stream.Stream;

public final class ADiamond implements Diamond {

    @Override
    public Diamond larger() {
        return new Larger(this, new A().next());
    }

    @Override
    public Stream<Line> top() {
        return Stream.empty();
    }

    @Override
    public Stream<Line> middle() {
        return Stream.of(new ALine());
    }

    @Override
    public Stream<Line> bottom() {
        return Stream.empty();
    }
}

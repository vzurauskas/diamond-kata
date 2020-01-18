package com.vzurauskas.diamondkata;

import java.util.stream.Stream;

public interface Diamond {
    Diamond larger();
    Stream<Line> top();
    Stream<Line> middle();
    Stream<Line> bottom();
}

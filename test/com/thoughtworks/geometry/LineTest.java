package com.thoughtworks.geometry;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LineTest {

    @Test
    public void havingSameStartPointsAndEndPointsHasLengthEqualsToZero() {
        Line line = new Line(1.0, 1.0, 1.0, 1.0);

        assertEquals(0.0d, line.length(), 0.2d);
    }



}

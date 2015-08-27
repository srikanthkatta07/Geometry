package com.thoughtworks.geometry;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LineTest {

    @Test
    public void havingSameStartPointsAndEndPointsHasLengthEqualsToZero() {
        Line line = new Line(1.0, 1.0, 1.0, 1.0);

        assertEquals(0.0d, line.length(), 0.2d);
    }

    @Test
    public void havingBothStartPointsAndEndPointsOnXAxis() {
        Line line = new Line(1.0, 0.0, 2.0, 0.0);
        assertEquals(1, line.length(), 0.2d);
    }

    @Test
    public void havingBothStartPointsAndEndPointsOnYAxis() {
        Line line = new Line(0.0, 1.0, 0.0, 2.0);
        assertEquals(1, line.length(), 0.2d);
    }

    @Test
    public void havingBothStartPointsAndEndPointsOnDiagonalAxis() {
        Line line = new Line(1.0, 1.0, 2.0, 2.0);
        assertEquals(1.414213, line.length(), 0.2d);
    }

    @Test
    public void havingBothStartPointsAndEndPointsOnCurve() {
        Line line = new Line(1.0, 1.0, 3.0, 2.0);
        assertEquals(2.236, line.length(), 0.2d);
    }



}

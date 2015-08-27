package com.thoughtworks.geometry;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

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

    @Test
    public void shouldEqualToItself() {
        Line line = new Line(1.0, 2.0, 3.0, 2.0);

        assertEquals(line, line);
    }

    @Test
    public void shouldNotEqualsToNull() {
        Line line1 = new Line(1.0, 2.0, 3.0, 2.0);
        Line line2 = null;

        assertNotEquals(line1, line2);
    }

    @Test
    public void shouldNotEqualsToOtherObjectWhcichIsNotALine() {
        Line line1 = new Line(1.0, 2.0, 3.0, 2.0);

        assertNotEquals(line1, 2);
    }

    @Test
    public void shouldNotEqualsToOtherLineWhichHasDifferentX1Points() {
        Line line1 = new Line(1.0, 2.0, 3.0, 2.0);
        Line line2 = new Line(3.0, 2.0, 3.0, 2.0);

        assertNotEquals(line1, line2);

    }

    @Test
    public void shouldNotEqualsToOtherLineWhichHasDifferentY1Points() {
        Line line1 = new Line(1.0, 2.0, 3.0, 2.0);
        Line line2 = new Line(1.0, 3.0, 3.0, 2.0);

        assertNotEquals(line1, line2);
    }

    @Test
    public void shouldNotEqualsToOtherLineWhichHasDifferentX2Points() {
        Line line1 = new Line(1.0, 2.0, 3.0, 2.0);
        Line line2 = new Line(1.0, 2.0, 4.0, 2.0);

        assertNotEquals(line1, line2);
    }

    @Test
    public void shouldNotEqualsToOtherLineWhichHasDifferentY2Points() {
        Line line1 = new Line(1.0, 2.0, 3.0, 2.0);
        Line line2 = new Line(1.0, 2.0, 3.0, 4.0);

        assertNotEquals(line1, line2);
    }

}

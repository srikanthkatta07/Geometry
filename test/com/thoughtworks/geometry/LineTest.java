package com.thoughtworks.geometry;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class LineTest {

    @Test
    public void havingSameStartPointsAndEndPointsHasLengthEqualsToZero() {
        Point point1 = new Point(1.0, 1.0);
        Point point2 = new Point(1.0, 1.0);
        Line line = new Line(point1, point2);

        assertEquals(0.0d, line.length(), 0.2d);
    }

    @Test
    public void havingBothStartPointsAndEndPointsOnXAxis() {
        Point point1 = new Point(1.0, 0.0);
        Point point2 = new Point(2.0, 0.0);
        Line line = new Line(point1, point2);

        assertEquals(1, line.length(), 0.2d);
    }

    @Test
    public void havingBothStartPointsAndEndPointsOnYAxis() {

        Point point1 = new Point(0.0, 1.0);
        Point point2 = new Point(0.0, 2.0);
        Line line = new Line(point1, point2);

        assertEquals(1, line.length(), 0.2d);
    }

    @Test
    public void havingBothStartPointsAndEndPointsOnDiagonalAxis() {

        Point point1 = new Point(1.0, 1.0);
        Point point2 = new Point(2.0, 2.0);
        Line line = new Line(point1, point2);

        assertEquals(1.414213, line.length(), 0.2d);
    }

    @Test
    public void havingBothStartPointsAndEndPointsOnCurve() {
        Point point1 = new Point(1.0, 1.0);
        Point point2 = new Point(3.0, 2.0);
        Line line = new Line(point1, point2);

        assertEquals(2.236, line.length(), 0.2d);
    }

    @Test
    public void shouldEqualToItself() {
        Point point1 = new Point(1.0, 1.0);
        Point point2 = new Point(1.0, 1.0);

        assertEquals(new Line(point1, point2), new Line(point1, point2));
    }

    @Test
    public void shouldNotEqualsToNull() {

        Point point1 = new Point(1.0, 2.0);
        Point point2 = new Point(3.0, 2.0);
        Line line2 = null;

        assertNotEquals(new Line(point1, point2), line2);
    }

    @Test
    public void shouldNotEqualsToOtherObjectWhcichIsNotALine() {
        Point point1 = new Point(1.0, 2.0);
        Point point2 = new Point(3.0, 2.0);

        assertNotEquals(new Line(point1, point2), 2);
    }

    @Test
    public void shouldNotEqualsToOtherLineWhichHasDifferentX1Points() {


        Line line1 = new Line(new Point(1.0, 2.0), new Point(3.0, 2.0));
        Line line2 = new Line(new Point(3.0, 2.0), new Point(3.0, 2.0));

        assertNotEquals(line1, line2);

    }

    @Test
    public void shouldNotEqualsToOtherLineWhichHasDifferentY1Points() {
        Line line1 = new Line(new Point(1.0, 2.0), new Point(3.0, 2.0));
        Line line2 = new Line(new Point(1.0, 3.0), new Point(3.0, 2.0));

        assertNotEquals(line1, line2);
    }

    @Test
    public void shouldNotEqualsToOtherLineWhichHasDifferentX2Points() {
        Line line1 = new Line(new Point(1.0, 2.0), new Point(3.0, 2.0));
        Line line2 = new Line(new Point(1.0, 2.0), new Point(4.0, 2.0));

        assertNotEquals(line1, line2);
    }

    @Test
    public void shouldNotEqualsToOtherLineWhichHasDifferentY2Points() {
        Line line1 = new Line(new Point(1.0, 2.0), new Point(3.0, 2.0));
        Line line2 = new Line(new Point(1.0, 2.0), new Point(3.0, 4.0));

        assertNotEquals(line1, line2);
    }


    @Test
    public void shouldEqualsToOtherLineWhichHavingItsSwapingCoordinates() {
        Line line1 = new Line(new Point(1.0, 0.0), new Point(0.0, 1.0));
        Line line2 = new Line(new Point(0.0, 1.0), new Point(1.0, 0.0));

        assertEquals(line1, line2);
    }


}

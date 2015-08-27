package com.thoughtworks.geometry;

import org.junit.Test;

import static org.junit.Assert.*;


public class PointTest {

    @Test
    public void shouldEqualToItSelf() {
        Point point = new Point(1.0, 2.0);

        assertEquals(point, point);
    }

    @Test
    public void shouldNotEqualsToNull() {
        Point point = new Point(1.0, 2.0);

        assertNotEquals(point, null);
    }

    @Test
    public void shouldNotEqualsToAnotherPointWhichHasDifferentXValues() {
        Point point1 = new Point(1.0, 2.0);
        Point point2 = new Point(2.0, 2.0);

        assertNotEquals(point1, point2);
    }

    @Test
    public void shouldNotEqualsToAnotherPointWhichHasDifferentYValues() {
        Point point1 = new Point(1.0, 2.0);
        Point point2 = new Point(1.0, 3.0);

        assertNotEquals(point1, point2);
    }

}

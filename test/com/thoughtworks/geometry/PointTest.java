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

}

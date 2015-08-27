package com.thoughtworks.geometry;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PointTest {

    @Test

    public void shouldEqualToItSelf() {
        Point point = new Point(1.0, 2.0);

        assertEquals(point, point);
    }

}

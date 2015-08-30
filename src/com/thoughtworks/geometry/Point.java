package com.thoughtworks.geometry;

import static java.lang.Math.*;
import static java.lang.StrictMath.sqrt;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }


    @Override
    public boolean equals(Object that) {
        if (that == null)
            return false;
        Point point = (Point) that;
        return point.x == this.x && point.y == this.y;
    }

    public double calculateDistance(Point point) {
        return sqrt(pow(this.x - point.x, 2) + pow(this.y - point.y, 2));
    }
}

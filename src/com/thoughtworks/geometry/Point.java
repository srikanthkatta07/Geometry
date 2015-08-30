package com.thoughtworks.geometry;

import static java.lang.Math.*;
import static java.lang.StrictMath.sqrt;

public class Point {
    private double x;
    private double y;
    private Point point;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object that) {
        if (that == null)
            return false;
        Point point = (Point) that;
        return point.x == this.x && point.y == this.y;
    }

    public double distanceTo(Point point) {
        return calculatingDistance(point);
    }

    private double calculatingDistance(Point thatPoint) {
        return sqrt(squareOfDifference(this.x, thatPoint.x) + squareOfDifference(this.y, thatPoint.y));
    }

    private double squareOfDifference(double value1, double value2) {
        return pow(value1 - value2, 2);
    }

    @Override
    public int hashCode() {
        double hash = 17;
        hash = hash * 31 + this.x;
        hash = hash * 31 + this.y;
        return (int)hash;
    }
}

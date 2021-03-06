package com.thoughtworks.geometry;

import static java.lang.StrictMath.*;

public class Line {

    private Point startPoint;
    private Point endPoint;

    public Line(Point point1, Point point2) {
        startPoint = point1;
        endPoint = point2;
    }

    public double length() {
        return startPoint.distanceTo(endPoint);
    }

    @Override
    public boolean equals(Object that) {
        if (that == null || !(that instanceof Line))
            return false;
        Line thatLine = (Line) that;
        Point thatStart = thatLine.startPoint;
        Point thatEnd = thatLine.endPoint;
        return comparingThePoints(thatStart, thatEnd);
    }

    private boolean comparingThePoints(Point theStart, Point theEnd) {
        return comparingCoordinates(theStart, theEnd) || comparingCoordinates(theEnd, theStart);
    }

    private boolean comparingCoordinates(Point theStart, Point theEnd) {
        return this.startPoint.equals(theStart) && this.endPoint.equals(theEnd);
    }
}

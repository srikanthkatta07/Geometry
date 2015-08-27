package com.thoughtworks.geometry;

import static java.lang.StrictMath.*;

public class Line {

    private double x1;
    private double x2;
    private double y1;
    private double y2;

    public Line(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public double length() {
        return sqrt(squareOfDifference(x1, x2) + squareOfDifference(y1, y2));
    }

    private double squareOfDifference(double value1, double value2) {
        return pow(value1 - value2, 2);
    }

    @Override
    public boolean equals(Object that) {
        if (that == null || !(that instanceof Line))
            return false;
        Line thatLine = (Line) that;
        return comparingCoordinates(thatLine);
    }

    private boolean comparingCoordinates(Line thatLine) {
        return thatLine.x1 == this.x1 && thatLine.y1 == this.y1 && thatLine.x2 == this.x2 && thatLine.y2 == this.y2;
    }
}

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
        double thatX1 = thatLine.x1;
        double thatX2 = thatLine.x2;
        double thatY1 = thatLine.y1;
        double thatY2 = thatLine.y2;
        return comparingCoordinatesInterchably(thatX1, thatY1, thatX2, thatY2);
    }

    private boolean comparingCoordinatesInterchably(double thatX1, double thatY1, double thatX2, double thatY2) {
        return comparingCoordinates(thatX1, thatY1, thatX2, thatY2) || comparingCoordinates(thatX2, thatY2, thatX1, thatY1);
    }

    private boolean comparingCoordinates(double x1, double y1, double x2, double y2) {
        return x1 == this.x1 && y1 == this.y1 && x2 == this.x2 && y2 == this.y2;
    }
}

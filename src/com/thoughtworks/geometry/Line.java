package com.thoughtworks.geometry;

public class Line {

    private double x1;
    private double x2;

    public Line(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.x2 = x2;
    }

    public double length() {

        return x2 - x1;
    }
}

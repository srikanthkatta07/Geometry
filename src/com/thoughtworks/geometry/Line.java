package com.thoughtworks.geometry;

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
        if (y1 == 0 && y2 == 0)
            return x2 - x1;
        return y2 - y1;
    }
}

package com.csc205.project2;

public class Cube extends ThreeDimensionalShape {
    private double width;

    public Cube() {
        this.width = 1.0; // Default size
    }

    public Cube(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double surfaceArea() {
        return 6 * width * width;
    }

    @Override
    public double volume() {
        return width * width * width;
    }

    @Override
    public String toString() {
        return "Cube - Volume: " + volume() + ", Surface Area: " + surfaceArea();
    }
}
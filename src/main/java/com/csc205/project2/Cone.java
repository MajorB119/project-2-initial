package com.csc205.project2;

public class Cone extends ThreeDimensionalShape {
    private double radius;
    private double height;

    public Cone() {
        this.radius = 1.0;
        this.height = 1.0;
    }

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double surfaceArea() {
        double slantHeight = Math.sqrt(radius * radius + height * height);
        return Math.PI * radius * (radius + slantHeight);
    }

    @Override
    public double volume() {
        return (1.0 / 3) * Math.PI * radius * radius * height;
    }

    @Override
    public String toString() {
        return "Cone - Volume: " + volume() + ", Surface Area: " + surfaceArea();
    }
}
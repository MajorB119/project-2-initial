package com.csc205.project2;

import java.util.ArrayList;
import java.util.List;

/**
 * Driver for project 2.
 *
 * Modify the driver as needed to demonstrate your classes.
 *
 */
public class Project2 {

    public static void main(String[] args) {

        /*
        The following code works with the example design given.
         */

        /*ThreeDimensionalShape sphere = new Sphere(2.0);
        ThreeDimensionalShape cube = new Cube(5.0);
        ThreeDimensionalShape cylinder = new Cylinder(4.0, 1.0);

        // We'll cover this stuff in module 4
        List<ThreeDimensionalShape> shapes = new ArrayList<>();
        shapes.add(sphere);
        shapes.add(cube);
        shapes.add(cylinder);

        shapes.forEach(System.out::println);

        /*
        The following code works with the code given.
         */

        Sphere sphere = new Sphere(2.0);
        Cube cube = new Cube(3);
        Cylinder cylinder = new Cylinder(2, 5);
        Cone cone = new Cone(2, 6);

        System.out.println(cube);
        System.out.println(sphere);
        System.out.println(cylinder);
        System.out.println(cone);
    }

}
abstract class ThreeDimensionalShape {
    public abstract double surfaceArea();
    public abstract double volume();
}

class Shape {
    public Shape() {}
}

class Cube extends ThreeDimensionalShape {
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

class Cylinder extends ThreeDimensionalShape {
    private double radius;
    private double height;

    public Cylinder() {
        this.radius = 1.0;
        this.height = 1.0;
    }

    public Cylinder(double radius, double height) {
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
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    public double volume() {
        return Math.PI * radius * radius * height;
    }

    @Override
    public String toString() {
        return "Cylinder - Volume: " + volume() + ", Surface Area: " + surfaceArea();
    }
}

class Cone extends ThreeDimensionalShape {
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



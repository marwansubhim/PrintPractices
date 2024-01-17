package day32_Tasks.ShapeTask;

public class Sphere extends Shape implements Area,Volume{

    public static final double PI = 3.14;
    private double radius, diameter;

    public Sphere(double radius, double diameter) {
        super("Sphere");
        setRadius(radius);
        setDiameter(diameter);
    }


    @Override
    public double area() {
        return  4 * PI * radius * radius;
    }

    @Override
    public double volume() {
        return  (4 / 3)*PI * radius*radius*radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double radius) {
        this.diameter = 2*radius;
    }
}
/*
Sphere
Volume
V = 4 / 3  * PI *  r^3
Surface
S = 4 * pi * r^2
 */
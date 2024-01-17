package day32_Tasks.ShapeTask;

public class Cylinder extends Shape implements Area,Perimeter{
    public final static double PI = 3.14;
    private double radius, height, diameter;

    public Cylinder(double radius, double diameter, double height){
        super("Cylinder");
        setRadius(radius);
        setDiameter(diameter);
        setHeight(height);
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

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = 2*radius;
    }

    public double area(){
        return 2 * PI * radius * (radius+height);
    }

    public double perimeter(){
        return ((2*diameter)+(2 * height));
    }

}

//Area of cylinder = 2 * pi * radius (radius+height)
// perimeter of cylinder = (2 * diameter) + ( 2 * height )
package day32_Tasks.ShapeTask;

public class Circle extends Shape implements Area,Perimeter{
    public final static double PI = 3.14;
    private double radius;
    public Circle(double radius){
        super("Circle");
        setRadius(radius);
    }

    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return this.radius;
    }
    @Override
    public double area(){
     return    radius * radius * PI;

    }

    @Override
    public double perimeter(){
     return 2 * PI * radius;
    }

}

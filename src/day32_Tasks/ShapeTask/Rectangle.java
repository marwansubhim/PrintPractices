package day32_Tasks.ShapeTask;

public class Rectangle extends Shape implements Area, Perimeter{
    private double length, width;

    public Rectangle(double length, double width){
        super("Rectangle");
        setLength(length);
        setWidth(width);

    }

    public void setLength(double length){
        this.length = length;
    }
    public void setWidth(double width){
        this.width = width;
    }

    public double getLength(){
        return this.length;
    }
    public double getWidth(){
        return this.width;
    }
    public double area(){
        return length + width;
    }

    public double perimeter(){
        return 2 * (length+width);
    }
}

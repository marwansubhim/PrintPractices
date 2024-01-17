package day31_Tasks.ShapeTask;

public class Rectangle extends Shape {
    public double l, w;

    public Rectangle(double l, double w) {
        super("Rectangle");
        if (l <= 0 || w <= 0) {
            throw new RuntimeException("No Such a Rectangle with a length and width of: " + l + " & " + w);
        }
        this.l = l;
        this.w = w;
    }

    @Override
    public double area() {
        return l * w;
    }

    @Override
    public double perimeter() {
        return 2 * (l + w);
    }

    @Override
    public String toString() {
        return "Shape{" +
                "name= '" + name + '\'' +
                ", area= "+area()+
                ", perimeter= "+perimeter()+
                '}';
    }
}

package day31_Tasks.ShapeTask;

public class Triangle extends Shape {
    public double a, b, c, h;

    public Triangle(double a, double b, double c, double h) {
        super("Triangle");
        if (a <= 0 || b <= 0 || c <= 0 || h <= 0) {
            throw new RuntimeException("No such triangle with side lengths of " + a + " & " + b + " & " + c + " & " + h);
        }
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    public double area() {
        return (h * b) / 2;
    }

    public double perimeter() {
        return a + b + c;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "name='" + name + '\'' +
                ", area= "+area()+
                ", perimeter= "+perimeter()+
                '}';
    }
}

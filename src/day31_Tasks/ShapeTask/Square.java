package day31_Tasks.ShapeTask;

public class Square extends Shape {
    public double s;

    public Square(double s) {
        super("Square");
        if (s <= 0) {
            throw new RuntimeException("No such length of side: " + s);
        }
        this.s = s;
    }

    public double area() {
        return s * s;
    }

    public double perimeter() {
        return 4 * s;
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

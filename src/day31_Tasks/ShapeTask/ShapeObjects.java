package day31_Tasks.ShapeTask;

public class ShapeObjects {
    public static void main(String[] args) {

        Circle circle = new Circle(4);
        Rectangle rectangle = new Rectangle(3,2);
        Triangle triangle = new Triangle(4,6,5,4);
        Square square = new Square(3);

        System.out.println(square.area());
    }
}

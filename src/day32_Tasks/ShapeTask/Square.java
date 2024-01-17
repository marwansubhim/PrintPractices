package day32_Tasks.ShapeTask;

public class Square extends Shape implements Area,Perimeter{
    private double side;

    public Square(double side) {
        super("Square");
        setSide(side);
    }

    public void setSide(double side) {
        this.side = side;
    }
    public double getSide(){
        return this.side;
    }
    public double area(){
        return side * side;
    }

    public double perimeter(){
        return 4 * side;
    }


}

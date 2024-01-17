package day32_Tasks.ShapeTask;

public class Cube extends Shape implements ThreeDEssentials{
    private double side;

    public Cube(double side){
        super("Cube");
        setSide(side);
    }

    public void setSide(double side){
        this.side = side;
    }
    public double getSide(){
        return this.side;
    }

    @Override
    public double area() {
        return 6*(side*side);
    }

    @Override
    public double perimeter() {
        return 6*(side*side);
    }

    @Override
    public double volume() {
        return side*side*side;
    }
}

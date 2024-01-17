package day31_Tasks.ShapeTask;

public class Circle extends Shape {
    public double r, d;
    public final static double PI = 3.14;

    public Circle(double r) {
        super("Circle");
        if (r<=0){
            throw new RuntimeException("No Such a Circle with a radius of: "+r);
        }
        this.r = r;
        d = 2 * r;
    }
    @Override
    public double area(){
        return r *r *PI;
    }
    @Override
    public double perimeter(){
        return 2 * PI * r;
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

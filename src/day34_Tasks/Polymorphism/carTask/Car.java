package day34_Tasks.Polymorphism.carTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name){
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }
    public String startEngine(){
        return "the "+name+"'s engine is stating";
    }
    public String accelerate(){
        return "the "+name+"'s engine is accelerating";

    }
    public String brake(){
        return "the "+name+"'s engine is braking";

    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}
class Mitsubishi extends Car{
    public Mitsubishi(int cylinders) {
        super(cylinders, "Mitsubishi");
    }
}
class Ford extends Car{

    public Ford(int cylinders) {
        super(cylinders, "Ford");
    }
}
class Holden extends Car{

    public Holden(int cylinders) {
        super(cylinders, "Holden");
    }
}




class test{
    public static void main(String[] args) {
        Car holden = new Holden(5);
        Car ford = new Ford(4);
        Car mitsubishi = new Mitsubishi(3);
        Car car = new Car(1,"car");

        List<Car> list = new ArrayList<>(Arrays.asList(holden,ford,mitsubishi,car));
        for (Car each: list) {
            System.out.println(each.startEngine());
            System.out.println(each.accelerate());
            System.out.println(each.brake());
        }


    }
}


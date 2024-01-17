package day31_Tasks.ShapeTask;

public class Shape {
    public String name;
    public Shape(String name){
        if (name.isEmpty()){
            throw new RuntimeException("Shape name can not be empty");
        }
        for (int i = 0; i<name.length(); i++){
            if (!Character.isLetter(name.charAt(i))){
                throw new RuntimeException("No such a shape");
            }
        }
        this.name = name;
    }
    public double area(){
        return 0;
    }
    public double perimeter(){
        return 0;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                '}';
    }


}

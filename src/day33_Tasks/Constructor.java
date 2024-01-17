package day33_Tasks;

public class Constructor {
    public int x,y,z,h;
    public String firstName, lastName;

    public Constructor(){
    }
    public Constructor(int x){
        this(x,5,8);
        System.out.println("my first integer "+x);

    }
    public Constructor(int x, int y){
        System.out.println("my integers "+x+" "+y);
    }

    public Constructor(int x, int y, int z){

        System.out.println("my integers "+x+" "+y + " "+z);
    }

    public Constructor(int x, int y, int z, int h){
        this(x,y,z);
        this.h = h;
        System.out.println("my last constructor");
    }
    public Constructor(String firstName){

    }

    public Constructor(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;

    }


}

class ConsObj{
    public static void main(String[] args) {
        Constructor obj0 = new Constructor("first","last");

        Constructor obj1 = new Constructor(6,5,6,8);
        Constructor obj2 = new Constructor();

        obj2.firstName = "firstName";
        obj2.lastName = "lastName";


    }
}
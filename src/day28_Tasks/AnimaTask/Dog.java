package day28_Tasks.AnimaTask;

public class Dog extends Animal {

    public Dog(String breed, String color, String name, String size, char gender, int age ) {
        setInfo(breed, color, name, size, gender, age);

    }

    public void bark() {
        System.out.println(name + " is barking");
    }

}


/*
class c {
    public static void main(String[] args) {
        Dog dog = new Dog();

    }
}

 */


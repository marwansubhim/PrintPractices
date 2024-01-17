package day28_Tasks.AnimaTask;

public class Zoo {
    public static void main(String[] args) {
        Dog dog = new Dog("German","yellow","Brad","Large",'M',30);
        Cat cat = new Cat("Chekawa","white","Meme","medium",'F',5);
        Tiger tiger = new Tiger("Sher Khan","Gray","TG","Large",'M',24);
        System.out.println(tiger);
        System.out.println(cat);
        System.out.println(dog);
        tiger.drink("juice");
        tiger.eat("bird meat");
        tiger.hunt();
        tiger.roar();
        dog.drink("water");
        System.out.println("*****************************************");

        cat.eat("chips");
        cat.drink("milk");
        cat.meow();
        cat.sleep();

        System.out.println("===========================================");

        dog.drink("water");
        dog.eat("sausage");
        dog.sleep();
        dog.bark();

    }
}

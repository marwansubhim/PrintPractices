package day28_Tasks.PersonTask;

public class Person {
    public String name;
    public char gender;
    public int age;

    public void setInfo(String name, char gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    public void eat(){
        System.out.println(name+" is eating");
    }
    public void sleep(){
        System.out.println(name+" is sleeping");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}

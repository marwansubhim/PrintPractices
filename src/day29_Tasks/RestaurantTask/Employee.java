package day29_Tasks.RestaurantTask;

public class Employee extends Person {
    public double hourlyRate;
    public String jobTitle, ID;

    public Employee(String name, int age, char gender, double hourlyRate, String jobTitle, String ID) {
        super(name, age, gender);
        this.hourlyRate = hourlyRate;
        this.jobTitle = jobTitle;
        this.ID = ID;
    }

    public void work(){
        System.out.println(name+" is working");
    }
    public double calcSalary(){
        return hourlyRate * 40 * 52;
    }

    @Override
    public String toString() {
        return "Employee{" +
                " name = '" + name + '\'' +
                ", ID = '" + ID + '\'' +
                ", jobTitle = '" + jobTitle + '\'' +
                ", gender = " + gender +
                ", age = " + age +
                ", hourlyRate = " + hourlyRate +
                ", salary= "+calcSalary()+
                '}';
    }
}
/*
Employee extends Person:
        name, age, gender, hourlyRate, jobTitle, ID
        setInfo, eat(), sleep(), work()
 */
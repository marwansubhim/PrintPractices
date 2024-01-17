package day28_Tasks.PersonTask;

public class Employee extends Person {
    /**
     * inherited variables; name, age, gender
     * inherited methods; eat, sleep, setInfo, toString
     */

    public double hourlyRate;
    public String jobTitle, ID;

    public static String publicVariable;
    protected static String protectedVariable;
    private static String privateVariable;
    static String defaultVariable;




    public void setInfo(String name, String jobTitle, String ID, int age, char gender, double hourlyRate) {
        setInfo(name, gender, age);
        this.hourlyRate = hourlyRate;
        this.jobTitle = jobTitle;
        this.ID = ID;

    }

    public void work() {
        System.out.println(name + " is working");
    }

    public double calcSalary() {
        return hourlyRate * 40 * 52;
    }

    @Override
    public String toString() {
        return "Employee{" +
                " name= '" + name + '\'' +
                ", age= " + age +
                ", jobTitle= '" + jobTitle + '\'' +
                ", ID= '" + ID + '\'' +
                " hourlyRate= $" + hourlyRate +
                ", gender= " + gender +
                ", salary: "+calcSalary()+
                '}';

        
    }
}

package day28_Tasks.PersonTask;

public class Tester extends Employee{
    /*
    Inherited variables; name, age, gender, jpbTitle, ID, hourlyRate
    Inherited methods; eat, sleep, work ,setInfo, toString
    * */

    public Tester(String name,String jobTitle, String ID, int age, char gender, double hourlyRate) {
        setInfo(name,jobTitle,ID,age,gender,hourlyRate);
    }
    public void testing(){
        System.out.println(jobTitle+", "+name+" is testing");
    }


}

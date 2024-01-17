package day28_Tasks.PersonTask;

public class Developer extends Employee{
    /*
   Inherited variables; name, age, gender, jpbTitle, ID, hourlyRate
   Inherited methods; eat, sleep, work ,setInfo, toString
   * */
    public Developer(String name,String jobTitle, String ID, int age, char gender, double hourlyRate){
        setInfo(name, jobTitle, ID, age, gender, hourlyRate);
    }
    public void coding(){
        System.out.println(jobTitle+", "+name+" is coding");
    }
}

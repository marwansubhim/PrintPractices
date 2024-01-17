package day29_Tasks.RestaurantTask;

public class Chef extends Employee{// chef IS An employee

    public Chef(String name, int age, char gender, double hourlyRate, String jobTitle, String ID){
        super(name,age,gender,hourlyRate,jobTitle,ID);
    }

    public void makeOrder(){
        System.out.println(jobTitle+" "+name+" is making order");
    }
    public void cooking(){
        System.out.println(jobTitle+" "+name+" is cooking");
    }



}

package day29_Tasks.RestaurantTask;

public class Server extends Employee{ // server IS An employee

    public Server(String name, int age, char gender, double hourlyRate, String jobTitle, String ID){
        super(name,age,gender,hourlyRate,jobTitle,ID);
    }
    public void takeOrder(){

        System.out.println(jobTitle+" "+name+" is taking order");
    }

    public void cleanTable(){

        System.out.println(jobTitle+" "+name+" is cleaning table");
    }
}

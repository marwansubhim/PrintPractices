package day04_Tasks;

public class Tasks_JohnDaniel {
    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Daniel";
        String fullName = firstName+' '+lastName;
        char gender = 'M';
        int age = 35;
        String companyName = "CapitalOne";
        String jobTitle = "SDET";
        boolean isFullTime = true;
        boolean isMarried = false;
        double salary = 120000.50;

        System.out.print("Employee' full name is: ");
        System.out.print(firstName+' ');
        System.out.println(lastName);
        System.out.println(fullName+"' gender is: "+gender);
        System.out.println(firstName+' '+lastName+"' age is: "+age+" years old\n"+fullName+"' works at: "+companyName);
        System.out.println(fullName+"' Job title is: "+jobTitle+"\n"+fullName+"' salary is "+salary+" $");
        System.out.println(fullName+"' is full time employee :"+isFullTime+"\n"+fullName+"' is married: "+isMarried);



    }
}

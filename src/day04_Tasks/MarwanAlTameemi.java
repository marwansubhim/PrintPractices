package day04_Tasks;

public class MarwanAlTameemi {

    public static void main(String[] args) {
        String firstName = "Marwan";
        String lastName = "Al Tameemi";
        String dateOfBirth ="April/15/1989";
        String fullName = firstName+' '+lastName;
        byte age = 34;
        String sport = "Weight Lifting";
        char gender = 'M';
        String companyName = "IBM";
        String jobTitle = "Software Security Engineer";
        double salary = 180_000.50;
        boolean isSingle = false;
        boolean isFullTime = true;
        boolean haveKids = true;


        System.out.println("Employee first name: "+firstName+"\nEmployee last name is: "+lastName+"\nEmployee Gender: "+gender+"\nEmployee DOB: "+dateOfBirth);
        System.out.println("Employee current age is: "+age+"\nEmployee favorite sport is "+sport);

        System.out.println("is Employee single? "+isSingle+"\nIs "+firstName+" have kids? "+haveKids+"\nCompany name: "+companyName);

        System.out.println(firstName+" works for "+companyName +" as a "+jobTitle+"\nEmployee salary is "+salary+'$');
        System.out.println("Full time job? "+isFullTime);

    }
}

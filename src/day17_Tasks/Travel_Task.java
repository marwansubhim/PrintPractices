package day17_Tasks;

import java.util.Scanner;
public class Travel_Task {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Do you have a valid password? ");
        String  validPassword = in.next();
        in.nextLine();

        double cost = 10;
        if (validPassword.equalsIgnoreCase("yes")){
           cost = 1000;
            System.out.println("What countries are you travelling to? ");
            String country = in.nextLine();

            System.out.println("How many bags will you take with you?");
            byte bag = in.nextByte();
            cost+=bag*50;
            System.out.println("How many people are travelling with you?");
            short numOfPeople = in.nextShort();
            if (numOfPeople<=3){
                cost-=numOfPeople*100;
            }
            in.nextLine();
            System.out.println("Enter the name of people who are travelling with you");
            String nameOfPeople  = in.nextLine();

            String printResult = "Your ticket is booked to "+country+". we have charged extra for the "+bag+" bags but you are travelling with "+
                    numOfPeople+" people who are "+nameOfPeople+" so we are giving a discount. your total cost is "+cost;
            System.out.println(printResult);

        }if (validPassword.equalsIgnoreCase("no"))
            {

            cost = 200;
            System.out.println("When was your passport be expired ?");
            int expirationDate = in.nextInt();
            int difference = 2020-expirationDate;
            cost+=75*difference;
            in.nextLine();
            System.out.println("What country are you plan to travel to?");
            String country = in.nextLine();

            System.out.println("Are you going to travel next year?");
            String nextYear = in.next();
            if (nextYear.equalsIgnoreCase("yes")){
                cost+=100;
            }
            if (nextYear.equalsIgnoreCase("no")){
                cost-=50;
            }
            String printResult = "Looks like you passport has been expired for "+difference+" years, but not worry we will get it ready for you to " +
                    "travel to "+country+". Your total cost has come out to "+cost;
            System.out.println(printResult);

        }
    }
}

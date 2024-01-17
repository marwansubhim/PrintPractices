package day11_Tasks;

public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        /*
        Warmup tasks:
    1. write a program that can find the number of days in a month
        (Assume that Feb has 28 days)
            Ex:
                month = 3
                output:
                    31 days
                month = 9
                output:
                    30 days
        Hints: it cannot be done with if&else statement, you will need single if statements
         */
        int month = 13;
        if (month<1||month>12){
            System.out.println("Invalid Month");
        }
        if (month==1){
            System.out.println("31 days");
        }if (month==2){
            System.out.println("28 days unless its leap year");
        }if (month==3){
            System.out.println("31 days");
        }if (month==4){
            System.out.println("30 days");
        }if (month==5){
            System.out.println("31 days");
        }if (month==6){
            System.out.println("30 days");
        }if (month==7){
            System.out.println("31 days");
        }if (month==8){
            System.out.println("31 days");
        }if (month==9){
            System.out.println("30 days");
        }if (month==10){
            System.out.println("31 days");
        }if (month==11){
            System.out.println("30 days");
        }if (month==12){
            System.out.println("31 days");
        }

    }
}

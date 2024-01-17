package day10_Task;

public class MinutesToYearsAndDays {

    public static void main(String[] args) {
//        long minutes = 561600L;
//        long days =  (minutes/1440); // here you should declare all variables using the same type "long"
//        System.out.println(days);
//        long years = days/365;
//        System.out.println(years);
//        long remainingDays = (days-(years*365));
//        System.out.println(remainingDays);
//        boolean ifPositive= days>0 && years>0;
//        //boolean ifNegative= days<0 && years<0; // here you can ignore declaring another boolean since you are required yo call it
//        // if we were asked to only use if statement then it will have to use another variable for the positive values
//        if(ifPositive){
//            System.out.println(minutes+" equal to "+years+" years"+" and "+remainingDays+" days");
//        }else{
//            System.out.println(minutes+" are invalid");
//        }
        long minutes = 1055120;
        if (minutes < 0) {
            System.out.println("Invalid Value");
        }else {
            long year = (minutes) / (525600);
            long remainder = minutes % 525600;
            long day = (remainder / 1440);
            String minuteToDaysYear = minutes + " min = " + year + " years and " + day + " days";
            System.out.println(minuteToDaysYear);
        }

    }
}

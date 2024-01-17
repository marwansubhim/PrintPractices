package day10_Task;

public class MinToYearsMonthAndDays {
    public static void main(String[] args) {
       // long minutes = 732560;
        //long year = (minutes/525600);
       // long month = (minutes%525600)/43200;
        //long days = ((minutes%525600)/1440);
        //long month = rem%43200;

        //long months = (year%43200)/12;
       // long day = (year/1440);

        //System.out.println(year+" "+days);
        //String result = minutes+"m = "+year+" y and "+month+" m and "+day+" d";
       // System.out.println(result);
       // System.out.println((5*1440)+(5*43200)+(5*1440));
    //}
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

        System.out.println("******************");

        System.out.println("Alaa is the best");



    }
}

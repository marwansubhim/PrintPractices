package day17_Tasks;

import java.util.Scanner;

public class VehicleRecall {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int vYear;
        System.out.println( "Enter vehicle's year:");
        vYear = in.nextInt();
        boolean withinRange = (vYear>=1995&&vYear<=1998)||(vYear==2001||vYear==202)||(vYear>=2004&&vYear<=2006)||(vYear>=2015&&vYear<=2017);
        if (withinRange) System.out.println("Your vehicle needs to be recalled!");
        else System.out.println("Your vehicle is fine, enjoy!");
    }
}

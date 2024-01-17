package day17_Tasks;

import java.util.Scanner;

public class SecondsConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numOfSeconds, hours, minutes, seconds;
        System.out.println("Enter seconds:");
        numOfSeconds = in.nextInt();
        hours = numOfSeconds / 3600;
        minutes = (numOfSeconds%3600)/60;
        seconds = (numOfSeconds%3600)%60;
        System.out.println(hours+" hours, "+minutes+" minutes, and "+seconds+" seconds");

    }
}

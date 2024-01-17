package day21_Tasks;

import java.util.Scanner;
/*
Write a program that takes input from user to display the minimum and maximum number whenever the user enters a negative number
 */
public class LoopPractice3 {
    public static void main(String[] args) {

        Scanner in =  new Scanner(System.in);
        System.out.println("enter a number");
        int num = in.nextInt();
        in.next();
        int min = num;
        int max = num;
        if (num>=0){
            while (true){
                num = in.nextInt();
                if (num<0)  break;

               max = num > max? num : max;
               min = num < min? num : min;
//                if (num>max) max = num;
//                if (num<min) min = num;
            }
            System.out.println("min = "+min + ", max = "+max);
        }else System.err.println(num+" is not valid");

    }
}

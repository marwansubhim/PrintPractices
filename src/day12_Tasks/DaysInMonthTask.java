package day12_Tasks;

import java.util.Scanner;

/*
2. write a program that can find the number of days in a month Note: MUST USE NESTED IF
 */
public class DaysInMonthTask {
    public static void main(String[] args) {
        int month = 13;
        String days = "";
        if (month>=1&&month<=12){
            boolean thirtyOne = month==1||month==3||month==5||month==7||month==8||month==10||month==12;
            boolean thirty = month==4||month==6||month==9||month==30;

            if (thirtyOne){
                days = "31 days";

            }else if (thirty){
                days = "30 days";
            }else {
                days = "28 days";
            }
            System.out.println(days);
        }else {
            System.out.println("Invalid Month");
        }
        int apple = 10;
        while (apple>=1){
            System.out.println("eating an apple"+apple);
            apple--;
        }
        System.out.println("no more apples");



    }
}

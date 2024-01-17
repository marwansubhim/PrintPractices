package day17_Tasks;

import java.util.Scanner;

/*
Scientists estimate that roughly 10 grams of caffeine consumed at one time is a  lethal overdose.
Write a program with a variable that holds the number of ms of caffeine
in a drink and outputs how many drinks it takes to kill a person. In one gram, there is 1000 mg.
Please refer to the image milligrams above as an example and use any number of variables you want. Dots mean space in the picture.

 */
public class CaffeineOverDose {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of milligrams in drink:");
        int milligrams = in.nextInt();
        int lethalDose = (10000/milligrams);
        System.out.println("It would take about "+lethalDose+" drinks for a lethal overdose.");
    }
}

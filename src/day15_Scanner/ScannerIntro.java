package day15_Scanner;

import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a byte number");
        byte b = input.nextByte();
        System.out.println("our number is: "+b);

    }
}

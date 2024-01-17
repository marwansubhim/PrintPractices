package day15_Scanner;

import java.util.Scanner;

public class ScannerBoolean {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter True or False");
        boolean b = input.nextBoolean();
        System.out.println(b);
        System.out.println("Opposite is: "+!b);

    }
}

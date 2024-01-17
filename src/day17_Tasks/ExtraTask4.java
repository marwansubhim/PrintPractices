package day17_Tasks;

import java.util.Scanner;

public class ExtraTask4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String first = in.nextLine();
        System.out.println("Enter the second string: ");
        String second = in.nextLine();
        if (first.length()>second.length()) System.out.println(first);
        else System.out.println(second);
    }
}

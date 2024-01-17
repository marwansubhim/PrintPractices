package day20_Tasks;

import java.util.Scanner;

public class FindTheLength {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the text:");
        String text = in.next();
        System.out.println("Length is: "+text.length());
    }
}

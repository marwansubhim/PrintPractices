package day17_Tasks;

import java.util.Scanner;

public class ExtraTask1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sentence = in.nextLine();
        System.out.println(sentence.charAt(0)+""+sentence.charAt(sentence.length()-1));
    }
}

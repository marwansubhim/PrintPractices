package day19_Tasks;

import java.util.Scanner;

public class PrintFirstAndLastLetter {
    public static void main(String[] args) {
        //DO NOT CHANGE
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE

        String FirstAndLast = word.charAt(0)+""+word.charAt(word.length()-1);
        System.out.println(FirstAndLast);
    }
}

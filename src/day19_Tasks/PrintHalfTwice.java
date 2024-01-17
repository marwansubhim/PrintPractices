package day19_Tasks;

import java.util.Scanner;

public class PrintHalfTwice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE
        int n1 = word.length()/2;
        String halfWord = word.substring(0,n1);
        System.out.println(halfWord+""+halfWord);
    }
}

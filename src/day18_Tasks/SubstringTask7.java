package day18_Tasks;

import java.util.Scanner;

/*
Ask user to enter two words. Then add them together and print.
But if the last letter if the first word and the first letter of the last letter is the same, print that character once.
                    Input:
                        one
                        eight
                    Output:
                        oneight
 */
public class SubstringTask7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two words");
        String word1 = in.next();
        String word2 = in.next();
        System.out.println(word1+word2);
    }
}

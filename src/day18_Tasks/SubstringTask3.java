package day18_Tasks;

import java.util.Scanner;

/*
 write a program that can check if the first and last characters of the string are same

			ex:
				level

			output:
				same

				java

			output:
				not same
 */
public class SubstringTask3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = in.next();
        if (word.charAt(0)==word.charAt(word.length()-1)) System.out.println("same");
        else System.out.println("not same");

    }
}

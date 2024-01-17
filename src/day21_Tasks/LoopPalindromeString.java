package day21_Tasks;

import java.util.Scanner;

public class LoopPalindromeString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a string");
        String sentence = in.nextLine();

        String str1 = "";
        String str2 = "";

        for (int i =0; i<=sentence.length()-1;i++) {
            str1 += sentence.charAt(i);

        }
        for (int j  = sentence.length()-1; j>=0; j--){
            str2+=sentence.charAt(j);

        }
        System.out.println(str1+"\n"+str2);
        System.out.println(str1.equalsIgnoreCase(str2)?"Palindrome":"not palindrome");

    }

}

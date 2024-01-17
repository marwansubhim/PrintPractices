package day19_Tasks;

import java.util.Scanner;

public class ReverseIt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE

        if (word.length()>5) System.out.println("Too long!");
        else if (word.length()==5){
            String reverseWord = word.charAt(word.length()-1)+""+word.charAt(3)+""+word.charAt(2)+""+word.charAt(1)+""+word.charAt(0);
            System.out.println(reverseWord);
        }else System.out.println("Too short!");
    }
}

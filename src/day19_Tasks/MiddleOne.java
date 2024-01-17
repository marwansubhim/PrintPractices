package day19_Tasks;

import java.util.Scanner;

public class MiddleOne {
    public static void main(String[] args) {
        //public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //YOUR CODE HERE

        if (word.length() >= 3 && word.length() % 2 != 0) {
            int middle = (word.length() / 2);
            System.out.println(word.charAt(middle));
        } else if (word.length() == 1) {
            for (int i = 1; i <= 3; i++) {
                System.out.print(word.charAt(0));
            }
        } else if (word.length() % 2 == 0 && word.length() >= 4) {
            int n1 = (word.length() / 2)-1;
            int n2 = word.length() / 2 ;
            System.out.println(word.charAt(n1) + "" + word.charAt(n2));
        } else {
            for (int i =1; i<=2; i++){
                System.out.print(word.charAt(0)+""+word.charAt(1));
            }
        }
    }
}

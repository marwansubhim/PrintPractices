package day18_Tasks;
/*
4. Write a program  for CheckWords:
        Program accepts 3 words and :
            - if they are same length:      print "All words are same length"
            - if some same length and others not:    print "Not Same nor Different lengths"
            - if all different length :  print "All different length"

 */
import java.util.Scanner;

public class SubstringTask9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter three words");
        String word1 = in.next();
        String word2 = in.next();
        String word3 = in.next();


        if (word1.length()==word2.length()&&word1.length()==word3.length()&&word2.length()==word3.length()){
            System.out.println("All equal");
        }else if (word1.length()==word2.length()||word1.length()==word3.length()||word2.length()==word3.length()){
            System.out.println("Not Same nor Different lengths");
        }else System.out.println("All different");
    }
}

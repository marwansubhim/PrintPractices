package day18_Tasks;

import java.util.Scanner;

/*/
Ask user to enter a word. If the work contains starts with x, print the word without x.
                    Input:
                        xcode
                    Output:
                        code
 */
public class SubstringTask5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = in.next();
        if (word.startsWith("x")) System.out.println(word.substring(1));
        else System.out.println(word);
    }
}

package InterviewQuestions.InterviewQuestions;
/*
This code can be used for multiple scenarios, just remember to only run the code with enabling
one if statement and disabling the rest to get a proper output
 */
import java.util.Scanner;

public class AllInOne {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("enter a string");
        String str = in.next().toLowerCase();
        String result = "";


        for (int j = 0; j <= str.length() - 1; j++) {
            char ch = str.charAt(j);
            int count = 0;

            for (int i = 0; i <= str.length() - 1; i++) {
                if (ch == str.charAt(i)) {
                    count++;
                }
            }

            if (count == 1) {   // this condition is used if we want to get the unique chars and remove the duplicates
                result += ch;
            }

            if (!result.contains("" + ch)) { // this condition is used if we want to get each char with its count
                result += "" + ch + count;
            }

            if (count>1){ // this condition is used if we want to remove unique chars and get the duplicates
                result+=ch;
            }
        }
        System.out.println(result + " ");
    }
}

package InterviewQuestions.InterviewQuestions;
/*
frequency of characters
            MUST apply for each loop
            str = "aabbbaa";
            output:
                a4b3
 */
public class FrequencyOfCharUsingArray {
    public static void main(String[] args) {

        String str = "aabbbaa";
        char[] arr = str.toCharArray();  //  char [] arr = [a, a, a, b, b, a]
        char ch = ' ';
        String result = "";
        for (char ch1 : arr) {
            ch = ch1;
            int count = 0;
            for (char each : arr) {
                if (each == ch) count++;
            }
            if (!result.contains(ch + "")) {
                result += ch + "" + count;
            }
        }
        System.out.print(result);
    }
}



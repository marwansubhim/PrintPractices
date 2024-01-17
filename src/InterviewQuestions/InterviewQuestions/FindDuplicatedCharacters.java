package InterviewQuestions.InterviewQuestions;

public class FindDuplicatedCharacters { // we can name this as "Remove Unique Characters"
    public static void main(String[] args) {// we can get the scanner object to get a user input

//        Scanner in  = new Scanner(System.in);
//        System.out.println("enter a string of char");
//        String str = in.next();

        String str = "aaabbbcccddqwertt";
        String result = "";


        for (int j = 0; j <= str.length() - 1; j++) {
            char ch = str.charAt(j);
            int count = 0;
            for (int i = 0; i <= str.length() - 1; i++) {
                if (ch == str.charAt(i)) {
                    count++;
                }
            }
            if (count > 1) {// if we use (count==1) we would get all the unique characters and remove the duplicated ones
                result += ch;
            }
        }
        System.out.println(result);
    }
}

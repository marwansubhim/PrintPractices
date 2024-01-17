package InterviewQuestions.InterviewQuestions;

public class FrequencyOfSingleChar {
    public static void main(String[] args) {

//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter a string");
//        String str = in.next();
//        System.out.println("enter a character");
//        char ch1 = in.next().charAt(0);

        String str = "aadddddbccdsafg";
        char ch1 = 'd';
        // we can employ a Scanner object to get both the string and the Char as a user input
        int count = 0;

        for (int i = 0; i<=str.length()-1; i++){

            if (ch1==str.charAt(i)){
                count++;
            }
        }
        System.out.println(ch1+""+count); //d6

    }
}

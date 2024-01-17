package InterviewQuestions.InterviewQuestions;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

//        Scanner in = new Scanner(System.in);
//        System.out.println("enter a string of characters");
//        String str = in.next();

        String str = "abbacplllllAAAaaq".toLowerCase();
        String result = "";
        // we can use a scanner object as shown above if we want to get the user input


        for (int j=0; j<=str.length()-1;j++){
            char ch = str.charAt(j);
            int count = 0;
            for (int i = 0; i<=str.length()-1;i++){
                if (ch==str.charAt(i)){
                    count++;
                }
            }
            if (!result.contains(""+ch))
            result+=""+ch+count;
//            if (count==1) {
//                 we use this condition if we want to identify a unique char
//                System.out.println(ch);
//            }
        }
        System.out.println(result); // a4b2c1
    }
}

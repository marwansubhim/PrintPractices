package InterviewQuestions.InterviewQuestions2;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "AAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaBBBCCC22";
        String str2 = "";

        for (int i = 0; i<str.length(); i++){
            if (!str2.contains(str.charAt(i)+"")) str2+=str.charAt(i);
        }
        System.out.println(str2);


    }
}

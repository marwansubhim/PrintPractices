package InterviewQuestions.InterviewQuestions;

public class PalindromeString {
    public static void main(String[] args) {
        String[] names = {"Anna","Nalan","Hannah","Emme"," Aidai"," Crisis","yasin","boB","kak"};
        int countPalindrome = 0;

        for (int j =0; j<=names.length-1;j++){
            String original = names[j];
            String reversed = "";
            for (int i =original.length()-1; i>=0;i--){
                reversed+=original.charAt(i);
            }
            if (original.equalsIgnoreCase(reversed)){
                countPalindrome++;
                System.out.println(original);
            }

        }
        System.out.println("count palindrome "+countPalindrome);
    }
}

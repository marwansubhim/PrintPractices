package InterviewQuestions.InterviewQuestions;

public class FindUniqueCharacters { // we can also categorize this under a different name which can be
                                    // "Remove duplicate characters"
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("enter a string");
//        String str = in.next();
//        in.close();
        String str = "aaapcccdeeef";
        String result = "";
        // we can use a scanner object to get a user input if we want
        for (int j =0; j<=str.length()-1;j++){
            char ch = str.charAt(j);
            int count = 0;
            for (int i = 0; i<=str.length()-1;i++){
                if (ch==str.charAt(i)){
                    count++;
                }
            }
            if (count==1){// if we use (count>1) we would get all the duplicated characters and remove the unique ones
                result+=ch;
            }
        }
        System.out.println(result); //pdf
    }
}

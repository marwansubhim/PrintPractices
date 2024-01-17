package InterviewQuestions.InterviewQuestions2;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String [] strArr = {"Dan", "Ron", "Wayne","Eric","Chad","Dan","Dan","Dan", "Ron", "Wayne","Eric","Chad","Dan","Dan"};
        String name = "Dan";
        int count = 0;
        for (int i  = 0; i< strArr.length; i ++){
            if (strArr[i].equalsIgnoreCase(name)){
               strArr[i]="";
                count++;
            }
        }
        System.out.println(count);
        Arrays.sort(strArr);
        String[] newOne = new String[strArr.length-count];
        for (int i = 0; i<newOne.length; i++){
            newOne[i] = strArr[i+count];
        }
        System.out.println(Arrays.asList(newOne));
    }
}

package InterviewQuestions.InterviewQuestions;

import java.util.Arrays;

public class CombineStringArrayUsingForEachLoop {
    public static void main(String[] args) {
        String[] group1 = {"Sara", "Jesicca","Parker", "Dragisa", "Sladjan"};
        String[] group2 = {"James", "Bonda", "Indiana", "Jones","Max", "Payne"};
        String[] group3 = {"Abdul", "Sacha", "Amin", "Salih", "Jessica"};
        String[] group4 = {"Justyna", "Adil","Ercan","Irina","Med", "Olesea","Vlad","Asuman","Guvenche"};

        String [] allGroup = new String[group1.length+group2.length+group3.length+group4.length];
        int j = 0;

        for (String each: group1){
            allGroup[j++] = each;
        }
        for (String each: group2){
            allGroup[j++] = each;
        }
        for (String each: group3){
            allGroup[j++] = each;
        }
        for (String each: group4){
            allGroup[j++] = each;
        }
        System.out.println(Arrays.toString(allGroup));
    }
}

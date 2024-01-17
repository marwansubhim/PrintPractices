package day25_Tasks;

import java.util.Arrays;

public class CombineStringArrayUsingForLoop {
    public static void main(String[] args) {
        String[] group1 = {"Sara", "Jesicca","Parker", "Dragisa", "Sladjan"};
        String[] group2 = {"James", "Bonda", "Indiana", "Jones","Max", "Payne"};
        String[] group3 = {"Abdul", "Sacha", "Amin", "Salih", "Jessica"};
        String[] group4 = {"Justyna", "Adil","Ercan","Irina","Med", "Olesea","Vlad","Asuman","Guvenche"};

        String [] allGroup = new String[group1.length+group2.length+group3.length+group4.length];
        int j =0;

        for (int i =0; i<group1.length; i++){
            allGroup[j++] = group1[i];
        }
        for (int i =0; i<group2.length;i++){
            allGroup[j++] = group2[i];
        }
        for (int i =0; i<group3.length;i++){
            allGroup[j++] = group3[i];
        }
        for (int i =0; i<group4.length;i++){
            allGroup[j++] = group4[i];
        }
        System.out.println(Arrays.toString(allGroup));
    }
}

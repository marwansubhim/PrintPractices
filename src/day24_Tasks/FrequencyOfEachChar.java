package day24_Tasks;

import java.util.Scanner;

public class FrequencyOfEachChar {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("enter a string");
        String str = in.next();
        String nonDup = "";
        for (int i = 0; i <= str.length() - 1; i++) {
            String ch = "" + str.charAt(i);
            if (!nonDup.contains(ch))
                nonDup += ch;
        }
        String result="";
        for (int j =0; j<=nonDup.length()-1;j++){
            int count = 0;
            char eachChar = nonDup.charAt(j);
            for (int i =0; i<=str.length()-1;i++){
                char ch = str.charAt(i);
                if (eachChar==ch)count++;
                result = eachChar + "" + count;
            }System.out.print(result);
        }
    }
}

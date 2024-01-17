package day23_Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("How many friend do you have");
        int length = in.nextInt();
        String [] names = new String[length];

        for (int i = 0;  i<names.length; i++){
            System.out.println("enter a name");
            names[i] = in.next();
        }

        System.out.println(Arrays.toString(names));

        Arrays.sort(names);
        System.out.println("=========================");
        System.out.println(Arrays.toString(names));
        System.out.println("=========================");
        String [] reversed = new String[length];
        for (int i = names.length-1, j =0; i>=0 ; i--, j++){

            reversed[j] = names[i];
        }
        System.out.println(Arrays.toString(names));
        System.out.println("********************");
        System.out.println(Arrays.toString(reversed));


    }

}

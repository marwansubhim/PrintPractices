package day23_Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("how many friends do you have");
        int num = in.nextInt();

        String[] fistName = new String[num];
        String[] lastName = new String[num];
        String fullName = "";
        for (int i = 0; i < num; i++) {

            System.out.println("enter first name");
            fistName[i] = in.next();
            fistName[i]=fistName[i].substring(0, 1).toUpperCase()+fistName[i].substring(1).toLowerCase();
            System.out.println("enter last name");
            lastName[i] = in.next();
            lastName[i] = lastName[i].substring(0, 1).toUpperCase()+lastName[i].substring(1).toLowerCase();
            fullName+= fistName[i] + " " + lastName[i]+"\n";

        }
        System.out.println("fullNames: \n" + fullName);
        System.out.println(Arrays.toString(fistName));
        System.out.println(Arrays.toString(lastName));

    }
}

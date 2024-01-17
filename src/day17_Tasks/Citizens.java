package day17_Tasks;

import java.util.Scanner;

public class Citizens {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        byte seniorCitizens, nonSeniorCitizens, age;
        System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens:");
        seniorCitizens = in.nextByte();
        nonSeniorCitizens = in.nextByte();
        System.out.println("What is new citizen's age?");
        age = in.nextByte();
        if (age>=65){
            System.out.println("Senior Citizen");
            seniorCitizens++;

        }else {
            System.out.println("Non-Senior Citizen");
            nonSeniorCitizens++;

        }
        System.out.println("New seniorCitizens count "+seniorCitizens);
        System.out.println("New nonSeniorCitizens count "+nonSeniorCitizens);
    }
}

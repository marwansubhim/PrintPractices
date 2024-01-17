package day15_Scanner;

import java.util.Scanner;

/*
 The marks obtained by a student in 3 different subjects are input by the user.
 Your program should calculate the average of subjects. The student gets a grade as per the following rules:
    90-100  A
    80-89   B
    70-79   C
    60-69   D
    0-59    F
    Ex: 86, 74, 90 -> B
 */
public class StudentMarks_Scanner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter student grades for the three subjects ");
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        int av = (n1+n2+n3)/3;
        char grade = ' ';
        boolean IsValid = (n1<0||n1>100)||(n2<0||n2>100)||(n3<0||n3>100);

        if (!IsValid){
            if (av>=0&&av<=59) grade = 'F';
            else if (av>=60&&av<=69) grade = 'D';
            else if (av>=70&&av<=79) grade = 'C';
            else if (av>=80&&av<=89) grade = 'B';
            else  grade = 'A';
            System.out.println("Student grade is "+grade);

        }else System.out.println("Invalid marks");
    }
}

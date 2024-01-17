package day15_Scanner;

import java.util.Scanner;
/*
Ask the user to enter two angle values (double).
Find out what the third angle of the triangle is (Triangles have 180 degrees total).
If the two angle values given exceed 180 already print "Invalid angles"
 */
public class TwoAngles_Scanner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first angle: ");
        double ang1 = in.nextDouble();
        System.out.print("Enter second angle: ");
        double ang2 = in.nextDouble();
        double ang3 = 180 -(ang1+ang2);
        boolean notValid = ((ang1<0||ang1>180)||(ang2<0||ang2>180)||(ang3<0||ang3>180));
        boolean validTriangle = (ang1+ang2+ang3)==180;
        if (notValid) System.out.println("Invalid angle input");
        else {
            if (validTriangle) System.out.println("Third angle is: "+ang3);
        }
    }
}

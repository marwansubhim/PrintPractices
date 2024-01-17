package day15_Scanner;


import java.util.Scanner;

public class Scanner_Short {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a short number");
        // scan.nextShort();
       // System.out.println("Number is: "+scan.nextShort());
      //  System.out.println("************************");
      //  System.out.println("Enter Your favorite integer: ");
      //  int favoriteNumber = scan.nextInt();
       // System.out.println("My favorite int is: "+favoriteNumber);

        System.out.println("**********************");
        System.out.println("Enter your name and age");

        String name = scan.nextLine();
        int age = scan.nextInt();
        System.out.print(name);
        System.out.println("! you are "+age+" years old");

    }
}

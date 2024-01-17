package day17_Tasks;

import java.util.Scanner;

public class GiftCard {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the item name");
        String item = in.nextLine();
        int balance;


         if (item.equalsIgnoreCase("Charger")) {
            balance = 100 - 15;
             System.out.println("Thank you for your purchase!\nYour current balance is " + balance+"$");

        } else if (item.equalsIgnoreCase("USB cable")) {
            balance = 100 - 10;
             System.out.println("Thank you for your purchase!\nYour current balance is " + balance+"$");
        } else if (item.equalsIgnoreCase("Headphones")) {
            balance = 100 - 30;
             System.out.println("Thank you for your purchase!\nYour current balance is " + balance+"$");
        } else if (item.equalsIgnoreCase("Pants")) {
            balance = 100 - 50;
             System.out.println("Thank you for your purchase!\nYour current balance is " + balance+"$");
        } else if (item.equalsIgnoreCase("Hat")) {
            balance = 100 - 25;
             System.out.println("Thank you for your purchase!\nYour current balance is " + balance+"$");
        } else if (item.equalsIgnoreCase("Socks")) {
            balance = 100 - 5;
             System.out.println("Thank you for your purchase!\nYour current balance is " + balance+"$");
        } else if (item.equalsIgnoreCase("Blanket")) {
            balance = 100 - 60;
            System.out.println("Thank you for your purchase!\nYour current balance is " + balance+"$");
        } else if (item.equalsIgnoreCase("Pillow")) {
            balance = 100 - 40;
             System.out.println("Thank you for your purchase!\nYour current balance is " + balance+"$");
        }else if ( item.equalsIgnoreCase("SMARTPHONE") ) {
            System.out.println("Sorry, not enough funds on your gift card!");
        }else if (item.equalsIgnoreCase("Laptop")){
             System.out.println("Sorry, not enough funds on your gift card!");
         }else

        {
             System.out.println("Invalid item");
         }

    }

}





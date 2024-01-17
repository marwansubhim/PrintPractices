package day17_Tasks;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int itemPrice, quarters, dimes, nickles;
        System.out.println("Enter.price.in.cents:");
        itemPrice = in.nextInt();
        if (itemPrice<25||itemPrice>100){
            System.out.println("Invalid price!");
        }else if (itemPrice%5!=0){
            System.out.println("Invalid price!");
        }else {
            int change = 100 - itemPrice;
            quarters = change/25;
            dimes = (change % 25)/10;
            nickles = ((change%25)%10)/5;

            System.out.println("Your change is "+quarters+" quarters, "+dimes+" dimes, and "+nickles+" nickels.");
        }
    }
}

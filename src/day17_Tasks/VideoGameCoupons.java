package day17_Tasks;

import java.util.Scanner;

public class VideoGameCoupons {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int coupons , candyBar, gumball;
        System.out.println("Enter number of coupons:");
        coupons = in.nextInt();
        candyBar = coupons/10;
        gumball = (coupons%10)/3;
        if (coupons<3){
            System.out.println("Not enough coupons");
        }else {
            System.out.println("Number of Candies: "+candyBar+"\nNumber of Gumballs: "+gumball);
        }

    }
}

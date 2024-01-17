package day15_Scanner;
/*
Cost can be calculated as the selling price of the product times the quantity sold,
 i.e. Cost price × quantity. Write a program that asks the user to enter product price and
 quantity and then calculate the Cost. If the Cost is more than 5000 a discount is 10% offered.
 Program should display the discount and discounted Cost.
    Ex: 100, 3 -> 300 --> Cost: 300, Discount: 0%
    Ex: 100, 60 -> 6000 -> Cost: 5400, Discount: 10%
 */
import java.util.Scanner;

public class ProductPrice_Scanner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the product unit price: ");
        double unitPrice = in.nextDouble();
        System.out.print("Enter unit quantity: ");
        int quantity = in.nextInt();
        double cost = unitPrice*quantity;
        boolean notValid = unitPrice<0||quantity<0;

        if (notValid) System.out.println("Invalid input");
        else {
            if (cost>500){
                double discounted = cost-(cost*0.1);
                System.out.println("Cost: $"+discounted+", Discount: 10%");
            }else System.out.println("Cost: $"+cost+", Discount: 0%");
        }
    }
}

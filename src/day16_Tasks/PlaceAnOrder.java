package day16_Tasks;

import java.util.Scanner;

/*
 Place an order
    - Ask the user the enter the product name (String, multiple words)
    - Ask the user to enter the price (double)
    - Ask the user to enter the quantity(int)
    - Ask the user to enter their first name (String, single word)
    - Print in the following format:
        "$firstName, your order for $quantity $productName has been placed. Your total is $totalCost(price * quantity)."
    Ex:
        Input: "Apples" , 1.5, 5. "Luke"
        Output: Luke, your order for 5 Apples has been places. Your total is 7.5.
 */
public class PlaceAnOrder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the product name: ");
        String ProductName = in.nextLine();
        System.out.print("Enter the price: ");
        double price = in.nextDouble();
        System.out.print("Enter the quantity: ");
        int quantity = in.nextInt();
        System.out.print("Enter your first name: ");
        String name = in.next();
        in.close();
        double totalPrice = price*quantity;
        System.out.println(name+" your order for "+quantity+" "+ProductName+" has been placed. Your total is "+totalPrice);

    }
}

package day17_Tasks;

import java.util.Scanner;

public class ShoppingListI {
    public static void main(String[] args) {
        String item1, item2, item3, report;
        double price1, price2, price3, totalPrice;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter item1 and its price: ");
        item1 = scan.next();
        price1 = scan.nextDouble();
        System.out.println("Enter item2 and its price: ");
        item2= scan.next();
        price2 = scan.nextDouble();
        System.out.println("Enter item3 and its price: ");
        item3 = scan.next();
        price3 = scan.nextDouble();
        totalPrice = price1+price2+price3;
        report = "Item1: "+item1+" Price: "+price1+", Item2: "+item2+" Price: "+price2+", Item3: "+item3+" Price: "+price3+"\nTotal price: "+totalPrice;
        System.out.println(report);
    }
}

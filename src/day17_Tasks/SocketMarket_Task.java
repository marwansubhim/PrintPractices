package day17_Tasks;

import java.util.Scanner;
/*
 Stock market
    - Ask the user how many total shares they have already? (int)
        -> If the user gives 0 or give a negative number none of the rest condition should be executed
    - Ask the user how much their total value in the stock market is (double)
    - Ask the user to enter the name of the company they have the most shares in (String, multiple words)
    - Ask the user the value of those shares (double)
    - Calculate and print the difference of the user's total stock market valued with the biggest share value
    - Print in the following format:
        "Your total stock market holding is $totalValue which is made up of $totalShareNumber.
        $companyName is the largest company holdings you have of $companyValue between $companyShares."
 */
public class SocketMarket_Task {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("How many total shares you already have? ");
        int shares = in.nextInt();
        if (shares<=0) System.out.println("Invalid input");
        else {
            System.out.print("How much your total value in the stock market? ");
            double totalValue = in.nextDouble();
            System.out.print("Enter the name of the company that you have the most shares with: ");
            String companyName = in.nextLine();
            System.out.print("What is the value of your shares? ");
            double shareValue = in.nextDouble();
            in.close();
            double difference =  totalValue - (shares*shareValue);
            System.out.println("your total stock market holding "+totalValue+" which is made up of "+shares+". "+companyName+" is the largest company holding" +
                    "you have of the "+difference);
        }
    }
}

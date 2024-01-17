package day18_Tasks;

import java.util.Scanner;

/*
 write a program to ask the user to enter two numbers and a math operator,
 the program should be able to return the calculation of those two numbers

		ex:
			num1 = 10;
			num2 = 20;
			operator = *
			output:
					200

			num1 = 30
			num2 = 5
			operator = /

			output:
					6

		pre condition:
				valid math operators are *, /, -, +, %

 */
public class Substring_Task1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = in.nextInt();
        System.out.println("Enter math operator");
        char operator = in.next().charAt(0);
        System.out.println("Enter second number");
        int num2 = in.nextInt();
        String result = "";
        if (operator=='*'||operator=='/'||operator=='-'||operator=='+'||operator=='%'){
            if (operator=='*'){
                result = "Multiplication is:"+(num1*num2);
            }else if (operator=='/'){
                result = "Division is: "+(num1/num2);
            }else if (operator=='-'){
                result = "Subtraction is: "+(num1-num2);
            }else if (operator=='+'){
                result = "Addition is: "+(num1+num2);
            }else  {
                result = "Remainder is: "+(num1%num2);
            }
            System.out.println(result);

        }else {
            System.err.println("Invalid operator");
        }
    }
}
//            switch(operator){
//
//                case '*': result = "Multiplication is:"+(num1*num2);
//                break;
//                case '/': result = "Division is: "+(num1/num2);
//                break;
//                case '+': result = "Addition is: "+(num1+num2);
//                break;
//                case '-': result = "Subtraction is: "+(num1-num2);
//                break;
//                case '%': result = "Remainder is: "+(num1%num2);
//                break;
//                System.out.println(result);

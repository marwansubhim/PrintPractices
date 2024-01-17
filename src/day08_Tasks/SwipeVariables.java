package day08_Tasks;

public class SwipeVariables {
    /*
     write a program that can swipe two variables' value by using a temporary variable
    Ex:
        a =10;
        b= 15;
    output:
        a is 15
        b is 10
4. write a program that can swipe two variables' value without using a temporary variable
    Ex:
        a =10;
        b= 15;
    output:
        a is 15
        b is 10
        Hint: you will need to use some Arithmetical Operators

     */

    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        System.out.println("a is "+(a+5)+"\nb is "+(b-5));

        System.out.println("********************");

        a+=5; b-=5;
        System.out.println("a is "+a+"\nb is "+b);

    }
}

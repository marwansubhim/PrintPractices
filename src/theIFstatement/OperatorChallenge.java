package theIFstatement;
/*
Challenge:
1- create a double variable with a value of 20.11
2- Create a second variable type double with a value of 80.11
3- Add both numbers together and multiply by 100.00
4-use the remainder operator to figure out what the remainder from the result of the operation in step 3 out of 40.00
5- create a boolean variable that assigns the value true if the remainder in #4 is 0, or false if its not zero
6- Output the boolean variable
7-Write an if-then statement that displays a message "Got some remainder" if the boolean in step 5 is not true.

 */
public class OperatorChallenge {
    public static void main(String[] args) {
        double var1 = 20;
        double var2 = 80;
        double result = (var1+var2)*100;
        double remainder = result%40;
        boolean isRemainderZero = (remainder==0)? true : false;
        System.out.println(isRemainderZero);
        if (remainder!=0){
            System.out.println("Got some remainder");
        }else {
            System.out.println("No remainder");
        }
    }
}

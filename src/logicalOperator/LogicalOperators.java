package logicalOperator;

public class LogicalOperators {

    public static void main(String[] args) {
        System.out.println(false&&false&&true);
        System.out.println(false&&true&&false);
        System.out.println(true&&false&&true);
        System.out.println(true&&true&&true);

        System.out.println("*************");

        System.out.println(false&false);
        System.out.println(false&true);
        System.out.println(true&false);
        System.out.println(true&true);

        System.out.println("************");

        System.out.println(false|false);
        System.out.println(false|true);
        System.out.println(true|false);
        System.out.println(true|true);

        System.out.println("===============");

        System.out.println(false||false);
        System.out.println(false||true);
        System.out.println(true||false);
        System.out.println(true||true);

        System.out.println("00000000000000");

        /* Logical AND and OR operators

        remember the truth table back when you studied in college over 10YEARS ago
        we can apply the same methodology with java
        * lets dig into some examples

         */

        System.out.println(2>3 & 1>5);
        System.out.println(2<5 & 1>2);
        System.out.println(1>4 & 5<8);
        System.out.println(2>1 & 3>2);

        System.out.println("---------");

        System.out.println(2>3 && 1>5);
        System.out.println(2<5 && 1>2);
        System.out.println(1>4 && 5<8);
        System.out.println(2>1 && 3>2 && 1>5);

        System.out.println("++++++++++");

        System.out.println(2>3 | 1>5);
        System.out.println(2<5 | 1>2);
        System.out.println(1>4 | 5<8);
        System.out.println(2>1 | 3>2);

        System.out.println("**********");

        System.out.println(2>3 || 1<5 || 5>2);
        System.out.println(2<5 || 1>2|| 5>9);
        System.out.println(1>4 || 5<8);
        System.out.println(2>1 || 3>2);
        System.out.println("$$$$$$$$$$$$$");

        /*
        Conclusion :
        * when we use the OR operator (| or ||) we always get true between two or more statements as long as one of them is true.
        * when we use the AND operator (& or &&) we always get false between two or more statements as long as one of them is false.
        * In OR(|,||) statement we only get false statement only when we have two or more false statements
        * In AND(&,&&) statement we only get true statement only when we have two or more true statements

        * Difference between (| vs ||), (& vs &&):
        When we use single logical operator such as | or & Java will check or read the next statement but when using
        || or && Java will stop reading the whole statement once it detects the second operator.

         */
        /*
        Logical XOR:
        symbol of this operator is ^
         * it will return false if statements are similar either all false or all true
         * it will return true if  statement are not similar like one is true and the other is false
         */

        System.out.println(false^false);
        System.out.println(false^true);
        System.out.println(true^false);
        System.out.println(true^true);

        System.out.println("*******");

        System.out.println(2>3 ^ 1>5);
        System.out.println(2<5 ^ 1>2);
        System.out.println(1>4 ^ 5<8);
        System.out.println(2>1 ^ 3>2);

        System.out.println("*********THE END*************");


    }
}

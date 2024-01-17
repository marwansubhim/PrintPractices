package theIFstatement;

public class ifStatements {
    public static void main(String[] args){

        /*
        the IF statement formula is if(condition){ code to be executed if the condition is met }
        when it comes to check if the condition within the IF statement is that we have to use the equal
        to instead of the assignment operators which are
        (>, <, >=, <=, ==, !=)

        Ternary Operator: is a conditional statement that boolean data type has to be used to return either false or true

        the code signature is : int one = 1;
                                int two = 2;
               check # 1        boolean oneGreaterThanTwo = (one > two)? true : false;
                               ** in this case the output is false because two > one
               check # 2        boolean oneNotEqualToTwo = ( one == two)? true : false;
                               ** in this case the output is false because one != two
               check # 3      boolean isTwoGreaterThanOne = (one < two)? true : false;
                              ** in this case the output will be true since two is always greater than one


         */

        int mahdiAge = 7;
        int majdAge = 3;
        if ((mahdiAge>majdAge) && (mahdiAge-majdAge==4)){
            System.out.println("Mahdi is older than Majd");
        }else System.out.println("Majd will never be older than Mahdi");

        boolean isCar = false;
        if (isCar== true){
            System.out.println("this is not supposed to happen");
        }

        int age = 50;
        if (age == 50){
            System.out.println("check if you use the conditional operators ");
        }
        boolean wasCar = isCar ? true: false;
        System.out.println(wasCar);

        int ageOfClient = 20;
        boolean isEighteenOrOver = ageOfClient ==19 ? true : false;
        System.out.println(isEighteenOrOver);
        System.out.println("**************");
        boolean isMahdiOlderThanMajd = (mahdiAge<majdAge)? true : false;
        System.out.println(isMahdiOlderThanMajd);
        System.out.println("******************");
        int one = 1;
        int two = 2;
        boolean isOneGreaterThanTwo = (one>two)? true : false;
        System.out.println(isOneGreaterThanTwo);
        System.out.println("*******************");
        boolean isOneEqualToTwo = (one==two)? true : false;
        System.out.println(isOneEqualToTwo);
        System.out.println("********************");
        boolean isOneNotEqualTwo = (one!=two)? true : false;
        System.out.println(isOneNotEqualTwo);
        System.out.println("*****************");
        boolean isTwoGreaterThanOne = (two>one)? true : false;
        System.out.println(isTwoGreaterThanOne);






    }
}

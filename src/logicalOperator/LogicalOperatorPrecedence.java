package logicalOperator;

public class LogicalOperatorPrecedence {
    /*
    * The NOT operator ! will be evaluated first
    * The AND operator && will be evaluated second
    * the OR operator || will be evaluated third
     */
    public static void main(String[] args) {

        System.out.println(!(false) || true && false);
        // the order here is !(false)= true || true && false
        //                           =  true || ( true && false)
        //                           = true || false
        //                           =  true

        System.out.println("*****************");
        System.out.println(true || true && false || !(true) && false);
        //                 true || true && false || false && false
        //                 true || false || false && false
        //                 true || false || false
        //                 true || false
        //                 true
        System.out.println(5>9 || 3<7);

    }
}

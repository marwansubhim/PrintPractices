package day08_Tasks;

public class DrugsEligibility {
    public static void main(String[] args) {
        /*
        1. write a program that can check if the person is eligible to buy alcohol
        Ex:
            name = "James"
            age = 19
            output:
                James is eligible to buy alcohol?
                    false
            name = "Aaron"
            age = 39
            output:
                Aaron is eligible to buy alcohol?
                    true

         */
        String name = "Aaron";
        int age = 39;
        boolean isEligible = age>19;
        System.out.println(name+" is eligible to buy alcohol? "+isEligible);


    }
}

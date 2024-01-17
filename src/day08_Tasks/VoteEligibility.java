package day08_Tasks;

public class VoteEligibility {

    /*
     write a program that can check if the person is eligible to vote for Donald Trump or Joe Biden
        Ex:
            name = "John"
            citizenShip = "USA"
            output:
                John is eligible to vote for Donald Trump or Joe Biden?
                    true
            name = "Jimmy"
            citizenShip = "Korea"
            output:
                Jimmy is eligible to vote for Donald Trump or Joe Biden?
                    false

     */

    public static void main(String[] args) {
        String name = "Jimmy";
        String nationality = "Korea";

        boolean isEligible = nationality.equals("USA");
        System.out.println("is "+name+" eligible to vote for Donald Trump or Joe Biden? "+isEligible);
    }
}

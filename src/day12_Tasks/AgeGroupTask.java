package day12_Tasks;
/*
3. write a program that can define the age groups of a person
            age groups are:
                    Teenager (< 21)
                    Adult   (>=21 && <55 )
                    Senior  ( > 55 )
                Hint:  age cannot be negative or greater than 150
                  NOTE: MUST APPLY NESTED IF
 */
public class AgeGroupTask {
    public static void main(String[] args) {
        int age = 59;
        String group = "";
        if (age>=0&&age<=150){

            if (age<21){
                group = "Teenager";
            }else if (age>=21&&age<55){
                group= "Adult";
            }else {
                group = "Senior";
            }
            System.out.println(group);

        }else {
            System.out.println("Invalid age");
        }
    }
}

package day13_Tasks;

public class HappyValleySchool {
    public static void main(String[] args) {

        int age = -10;
        String label ="";
        if (age<2||age>18) label = "ineligible";
        else if (age==2) label = "toddler";
        else if (age>=3&&age<=5) label = "early childhood";
        else if (age==6||age==7) label = "young reader";
        else if (age>=8&&age<=10) label = "elementary";
        else if (age==11||age==12) label = "middle";
        else if (age==13) label = "impossible";
        else if (age>=14&&age<=16) label = "high school";
        else if (age==17||age==18) label = "scholar";

        System.out.println(label);
    }
}

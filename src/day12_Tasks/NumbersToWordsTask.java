package day12_Tasks;

/*
 1. write a java program that can convert numbers between 0 ~ 9 to words, if the number is greater than 9 or
  less than zero, out put should be "Invalid". Note: MUST USE NESTED IF
 */
public class NumbersToWordsTask {
    public static void main(String[] args) {


        int num = 4;
        String number = "";
        if (num>=0&&num<=9){

            if (num==0){
                number = "Zero";
            }else if (num==1){
                number = "One";
            }else if (num==2){
                number = "Two";
            }else if (num==3){
                number= "Three";
            }else if(num==4){
                number = "Four";
            }else if (num==5){
                number = "Five";
            }else if (num==6){
                number="Six";
            }else if (num==7){
                number="Seven";
            }else if (num==8){
                number="Eight";
            }else {
                number="Nine";
            }
            System.out.println(number);

        }else{
            System.out.println("Invalid");
        }

    }
}

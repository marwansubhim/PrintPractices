package day34_Tasks.otherTasks;

public class EvenDigitSum {
    public static void main(String[] args) {

        int num = -55;
        int n1 = num % 10;
        int n2 = (num / 10) % 10;
        int n3 = (num / 100) % 10;
        int n4 = (num / 1000) % 10;
        int n5 = (num / 10000) % 10;
        int n6 = (num / 100000) % 10;
        ///  for (int i =0; i<)

        int result = 0;
        System.out.println(getEvenDigitSum(num));
//        for (int i =1, j=0; num>0; i++, j++){
//            System.out.println(Integer.valueOf((num /(int) Math.pow(10,j)) % 10));
//        }
        /*
        while (num > 0) {
            if (num < 0) break;
            else {
                if (num % 2 == 0) {
                    result += num % 10;
                }
            }
            num /= 10;
        }
        System.out.println(result);

         */

    }

    public static int getEvenDigitSum(int number) {
        if (number < 0){
            return -1;
        }
        int result = 0;
        while (number > 0) {
                if (number % 2 == 0) {
                    result += number % 10;
                }
            number /= 10;
        }
        return result;
    }
}

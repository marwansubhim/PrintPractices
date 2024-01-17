package day34_Tasks.otherTasks;

public class SharedDigit {

    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 52;
        System.out.println(hasSharedDigit(9,99));


    }

    public static boolean hasSharedDigit(int num1, int num2) {
        int temp = num2;
        if ((num1 < 10 || num1 > 99) || (num2 < 10 || num2 > 99)) return false;
        else {
            while (num1 != 0) {
                while (num2 != 0) {
                    int r1 = num2 % 10;
                    int r2 = num1 % 10;
                    if (r1 == r2){
                        return true;
                    }
                    num2 /= 10;
                }
                num2 = temp;
                num1 /= 10;
            }
        }
        return false;
    }
}

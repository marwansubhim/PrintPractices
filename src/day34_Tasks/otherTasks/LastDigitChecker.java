package day34_Tasks.otherTasks;

public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(777, 771, 77));
        System.out.println(isValid(1051));
//(num1 >= 10 && num2 <= 1000) && (num2 >= 10 && num2 <= 100) && (num3 >= 10 && num3 <= 1000)

    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        if (isValid(num1) && isValid(num2) && isValid(num3)) {
            return (num1 % 10 == num2 % 10) || (num2 % 10 == num3 % 10) || (num1 % 10 == num3 % 10);
        } else return false;
    }
    public static boolean isValid(int num) {
        if (num >= 10 && num <= 1000) return true;
        else return false;
    }
}

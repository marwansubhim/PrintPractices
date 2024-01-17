package day07_Tasks;

public class UnaryOperators_Task02 {
    public static void main(String[] args) {
        int a = 1;
        a = -a-- + a++ / -a-- * --a; // 
        System.out.println(a);
    }
}

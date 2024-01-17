package day07_Tasks;

public class UnaryOperators_Task01 {
    public static void main(String[] args) {
        int x =2;
        int y = x++;
        System.out.println(y); // y = 2
        System.out.println("*********");

        System.out.println(x++); // output will be 3 but the new value of x = 4
        System.out.println(x);
        System.out.println("***********");

        System.out.println(--x); // output will be 3 but the new value of x = 3
        System.out.println(x);
        System.out.println("**************");

        int z = 8;
        int d = z--;
        System.out.println(d); // value of d will be 8 but the new value of z = 7
        System.out.println(z);
    }
}

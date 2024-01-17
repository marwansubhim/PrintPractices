package day17_Tasks;
import java.util.*;
public class BurgerOrChicken {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String in = s.next();
        if (in.equalsIgnoreCase("burger")||in.equalsIgnoreCase("chicken")){
            System.out.println("output: 10.0");
        }if (in.equalsIgnoreCase("soda")) System.out.println("output: 2.0");
    }
}

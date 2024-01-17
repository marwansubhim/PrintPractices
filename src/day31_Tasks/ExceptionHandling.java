package day31_Tasks;

public class ExceptionHandling {
    public static void main(String[] args) {
        String str = "dfgghfgbhfg";

        try {
            System.out.println(str.charAt(100));
        }catch (StringIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
           // e.printStackTrace();
        }
        System.out.println("Test Done");

    }
}

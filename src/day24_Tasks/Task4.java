package day24_Tasks;

public class Task4 {
    public static void main(String[] args) {

        String[] names = {"Bob", "Ron", "don", "dad", "mam"};
        int count = 0;

        for (int j = 0; j <= names.length - 1; j++) {
            String original = names[j];
            String reversed = "";

            for (int i = original.length() - 1; i >= 0; i--) {

                reversed += original.charAt(i);

                if (original.equalsIgnoreCase(reversed)) {
                    count++;
                    System.out.println(original);
                }
            }
        }
        System.out.println("count is: " + count);
    }
}
/*
String[] names = {"Anna","Nalan","Hannah","Emme"," Aidai"," Crisis","yasin","boB"};
        int countPalindrome = 0;

        for (int j = 0; j<=names.length-1; j++){
            String original = names[j];
            String reversed = "";

            for (int i = original.length()-1; i>=0; i--){

                reversed+=original.charAt(i);
            }
            if (original.equalsIgnoreCase(reversed)){
                countPalindrome++;
                System.out.println(original);
            }
        }
        System.out.println("countPalindrome = " + countPalindrome);
 */
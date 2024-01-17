package day30_Tasks;

public class SameLetter {


    public static void main(String[] args) {
        String str1 = "abv";
        String str2 = "ABV";
        System.out.println(sameLetter(str1, str2));


    }
    public static boolean sameLetter(String str1, String str2){

        String a = "";
        String b = "";
        for (String each : str1.split("")) if (!a.contains(each)) a += each;
        for (String each : str2.split("")) if (!b.contains(each)) b += each;
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < b.length(); j++) {
                if (a.toLowerCase().charAt(i) == b.toLowerCase().charAt(j)) count++;
            }
        }
        if (count == a.length() && count == b.length()) return true;
        else return false;

    }
}

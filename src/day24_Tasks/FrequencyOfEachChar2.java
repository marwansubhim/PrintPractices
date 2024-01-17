package day24_Tasks;

public class FrequencyOfEachChar2 {
    public static void main(String[] args) {

        String str = "aabbbbbvb";
        String result = "";

        for (int i = 0; i<=str.length()-1;i++){
            char firstChar = str.charAt(i);
            int count = 0;

            for (int j = 0; j<=str.length()-1; j++){
                char secondChar = str.charAt(j);
                if (secondChar==firstChar)count++;
            }
            if (!result.contains("" + firstChar)) {
                result+=""+firstChar+count;
            }
        }
        System.out.println(result);
    }
}

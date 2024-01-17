package day26_Tasks;

public class ArraysExample2 {
    public static void main(String[] args) {

        String[] strArr = {"dote", "dotes", "toes", "set", "dot", "dots", "sted"}; //"cat", "create", "sat"
        String word = "tossed";
        int points = 0;

        for (String each : strArr) {
            int count = 0;
            for (int i = 0; i < each.length(); i++) {
                if (word.contains(each.charAt(i) + "")) count++;
            }
            if (count == each.length()) {
                if (each.length() == 3) points += 1;
                else if (each.length() == 4) points += 2;
                else if (each.length() == 5) points += 3;
                else if (each.length() == word.length()) points += 54;
            }
        }
        System.out.println(points);
        System.out.println("=========================================");

        // String str ="011000100110001001100011";   //  0    0    1    0    1   1   0   0
        //      128  64   32   16   8   4   2   1   01100001
        //      0   +    32+   0 + 8  + 4 + 0 + 0 (0110001001100011)

//        Scanner in = new Scanner(System.in);
//        String str1 = in.nextLine();
        //str1.substring(0,8)


        String str1 = "0110101001101011011011010010000001100001";
        String str = "";

        if (str1.length() % 8 == 0) {
            for (int x = 0, y = 8; x < str1.length(); x += 8, y += 8) {

                str += str1.substring(x, y);
                int sum = 0;
               // ArrayList<Integer> intArr = new ArrayList<>();
                String[] strArr1 = str.split("");
                int [] intArr = new int[strArr1.length];
                for (int i = 0; i < strArr1.length; i++) {
                    //intArr.add(Integer.parseInt(strArr1[i]));

                    intArr[i] = Integer.parseInt(strArr1[i]);
                }
                for (int i = 0, j = 128; i < intArr.length; i++, j /= 2) {
                    sum += j * intArr[i];
                }
                System.out.print((char) (sum));
                str = "";
            }
        } else System.err.println("input a multiple of 8s");


    }
}

package day26_Tasks;

import java.util.ArrayList;

public class BinaryToAsciiConverter {
    public static void main(String[] args) {
        String str1 = "0100100001100101011011000110110001101111001000000110011101110010011011110111010101110000";

        String str2 = "";
        boolean isValid =  str1.contains("0") && str1.contains("1") &&  str1.length() % 8 == 0;

        if (isValid) {
            for (int x = 0, y = 8; x < str1.length(); x += 8, y += 8) {
                str2 = str1.substring(x, y); // str2 = 01001000
                int sum = 0;
                String[] strArr = str2.split(""); // strArr [0,1,0,0,1,0,0,0]
                ArrayList<Integer> intArr = new ArrayList<>();
                for (int i = 0; i < strArr.length; i++) {
                    intArr.add(Integer.parseInt(strArr[i])); // intArr [0,1,0,0,1,0,0,0]           //  128  64   32   16  8  4  2  1
                }                                                                                 //    s   64    s    s  8  s  s  s
                for (int i = 0, j = 128; i < intArr.size(); i++, j /= 2) {
                    sum += j * intArr.get(i);
                }
                System.out.print((char) (sum));
                str2 = "";
            }
        } else System.err.println("Please input binary numbers as a multiple of 8s");

    }
}

//0110100001100101011011000110110001101111
//010010010010000001101100011010010110101101100101001000000100001101111001011000100110010101110010011101000110010101101011
package day26_Tasks;

public class AsciiToBinaryConverter {
    public static void main(String[] args) {

        String str1 = "Hello group";
        String str2 = "";
        int numOfChar = 0;
        int[] binary = new int[8];
                                                                 // 255 128  64  32  16  8  4  2  1

                                                                //{ (num%256)/128, (num%128)/64,(num%64)/32,(num%32)/16,(num%16)/8,(num%8)/4,(num%4)/2,(num%2)/1 }
        for (int n = 0; n < str1.length(); n++) {              //   0                 1           0             0                1      0         0          0
            numOfChar =  str1.charAt(n);
            for (int i = 0, j = 256, k = j / 2; i < binary.length; i++, j /= 2, k /= 2) {
                binary[i] = (numOfChar % j) / k;
            }
            for (int each : binary) str2 += each + "";
            //sum = 0;

        }
        System.out.println(str2);



    }
}


//System.out.println(Arrays.toString(binary));
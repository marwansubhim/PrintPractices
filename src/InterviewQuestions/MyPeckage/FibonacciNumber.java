package InterviewQuestions.MyPeckage;

import java.util.ArrayList;
import java.util.Arrays;

public class FibonacciNumber {
    public static void main(String[] args) {
        // 0 1 1 2 3 5 8 13 21 .....
        int number = 5;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        for (int i = 2; i<=number; i++){
           list.add(list.get(i-1)+list.get(i-2));
        }
       // for (Integer each: list) System.out.print(each+" ");
       // System.out.println();

        System.out.println("Solution 1");
        System.out.println("int number = 25;\n" +
                "        ArrayList<Integer> list = new ArrayList<>();\n" +
                "        list.add(0);\n" +
                "        list.add(1);\n" +
                "        for (int i = 2; i<=number; i++){\n" +
                "           list.add(list.get(i-1)+list.get(i-2));\n" +
                "        }");
        System.out.println(list);


        System.out.println("*****************************************************************************************");

        int[] intArr = new int[number+1];

        intArr[0] = 0;
        intArr[1] = 1;

        for (int i = 2; i<=number ; i++){
            intArr[i] = intArr[i-2] + intArr[i-1];
        }

        System.out.println("Solution 2");
        System.out.println("   int[] intArr = new int[number+1];\n" +
                "\n" +
                "        intArr[0] = 0;\n" +
                "        intArr[1] = 1;\n" +
                "\n" +
                "        for (int i = 2; i<=number ; i++){\n" +
                "            intArr[i] = intArr[i-2] + intArr[i-1];\n" +
                "        }");
        System.out.println(Arrays.toString(intArr));


        System.out.println("*****************************************************************************************");
        System.out.println("Solution 3");
        System.out.println(" int num = 25;\n" +
                "        int n1 = 0, n2 = 1, n3 = 0, count = 0;\n" +
                "\n" +
                "        while (count<=num){\n" +
                "            System.out.print(n1+\" \");\n" +
                "            n3 = n1+n2;\n" +
                "            n1 = n2;\n" +
                "            n2 = n3;\n" +
                "            count++;\n" +
                "\n" +
                "        }");
        int num = 5;
        int n1 = 0, n2 = 1, n3 = 0, count = 0;

        while (count<=num){
            System.out.print(n1+" ");
            n3 = n1+n2;
            n1 = n2;
            n2 = n3;
            count++;

        }


    }
}

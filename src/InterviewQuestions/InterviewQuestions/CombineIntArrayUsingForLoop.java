package InterviewQuestions.InterviewQuestions;

import java.util.Arrays;

public class CombineIntArrayUsingForLoop {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5};
        int [] b = {6,7,8,9,10};
        int [] d = {10,20,30,40,50};

        int [] c = new int[a.length+b.length+d.length];

        int j =0;

        for (int i =0;i<a.length;i++){
            c[j++] = a[i];
        }
        for (int i = 0; i<b.length;i++){
            c[j++] = b[i];
        }
        for (int i = 0;  i<d.length ; i++){
            c[j++] = d[i];
        }
        System.out.println(Arrays.toString(c));
    }
}

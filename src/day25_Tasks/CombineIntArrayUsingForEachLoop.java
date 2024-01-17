package day25_Tasks;

import java.util.Arrays;

public class CombineIntArrayUsingForEachLoop {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5};
        int [] b = {6,7,8,9,10};
        int [] d = {10,20,30,40,50};
        int [] c = new int[a.length+b.length+d.length];
        int j =0;

        for (int each : a){
            c[j++] = each;
        }
        for (int each: b){
            c[j++] = each;
        }
        for (int each: d){
            c[j++] = each;
        }
        System.out.println(Arrays.toString(c));
    }
}

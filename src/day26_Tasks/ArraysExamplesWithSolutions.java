package day26_Tasks;

public class ArraysExamplesWithSolutions {
    public static void main(String[] args) {

        /*finding missing letters
        String letters = "";
        String sentence = "bcdefgh";
        String missing = "";

        for (char i = 97; i < 123; i++) {
            letters += i + "";
        }
       for (char each : letters.toCharArray()){
           if (sentence.indexOf(each) == -1 )missing+=each;
       }
        System.out.println(missing);

         */

        /* Find the largest Gap in an array
        int[] arr = {12,36,2,1,4,0,2,185,8,85};
        Arrays.sort(arr);
        int largestGap = arr[1]-arr[0];
        for (int i =0, j =1; i<arr.length&&j<arr.length ; i++, j++){
            if (arr[j]-arr[i]>largestGap)largestGap=arr[j]-arr[i];
        }
        System.out.println(largestGap);

         */


        /* Array Multiplier
        int [] intArr = {12};
        int multiplier  = 10;
        ArrayList<Integer> newArr = new ArrayList<>() ;
        for (int i =1; i<=multiplier ; i++){
         newArr.add(intArr[0]*i);
        }
        System.out.println(newArr);

         */


        /* converting multiDimensional Array to a single array

        String[][] arr2D = {{"abc", "efg", "ijk"}, {"cad", "iuy", "fdr"}};
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                strings.add(arr2D[i][j]);
            }
        }
        System.out.println(strings);

         */


    }
}

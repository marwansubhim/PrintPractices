package InterviewQuestions.MyPeckage;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDan {
    public static void main(String[] args) {

        // Solution 1
        String[] strArr = {"Dan", "Ron", "Wayne", "Dan", "Eric", "Chad", "Dan", "Dan"};
        ArrayList list = new ArrayList();
        list.addAll(Arrays.asList(strArr));
        list.removeIf(p -> p.equals("Dan"));
        System.out.println(list);

        // Solution 2
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList(strArr));
        list1.removeIf(p -> p.equalsIgnoreCase("Dan"));
        System.out.println(list1);

        // Solution 3
        int count = 0;
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equalsIgnoreCase("Dan")) {
                strArr[i] = "";
                count++;
            }
        }
        Arrays.sort(strArr);
        String[] newOne = new String[strArr.length - count];
        for (int i = 0; i < newOne.length; i++) {
            newOne[i] = strArr[i + count];
        }
        System.out.println(Arrays.asList(newOne));

    }

    public static String[] removeName(String[] strArr, String name) {
        int count = 0;
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equalsIgnoreCase(name)) {
                strArr[i] = "";
                count++;
            }
        }
        Arrays.sort(strArr);
        String[] newOne = new String[strArr.length - count];
        for (int i = 0; i < newOne.length; i++) {
            newOne[i] = strArr[i + count];
        }
        return newOne;
    }
}

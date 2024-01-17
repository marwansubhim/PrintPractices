package day30_Tasks;

public class ReverseString {
    public static void main(String[] args) {
        String str = "123456";
        String str2 = "";
        String[] strArr = new String[str.length()];


        for (int i = str.length()-1 , j = 0; i >=0 && j < str.length(); i--, j++) {
            strArr[j] = str.charAt(i) + "";
            str2 += strArr[j];
        }



//        ArrayList<String> characters = new ArrayList<>();
//        characters.addAll(Arrays.asList(str.split("")));

//        for (int  i =0; i<str.length();i++){
//            characters.add(str.charAt(i)+"");
//        }

//        for (int i = characters.size()-1; i>=0; i--){
//            str2+=characters.get(i);
//        }
//        System.out.println(characters);


//        for (int i = str.length() - 1; i >= 0; i--) {
//            str2 += str.charAt(i) + "";
//        }


//        String[] strArr = str.split("");
//        System.out.println(Arrays.toString(strArr));
//        for (int i = 0; i < strArr.length / 2; i++) {
//            String temp = strArr[i];
//            strArr[i] = strArr[strArr.length - 1 - i];
//            strArr[strArr.length - 1 - i] = temp;
//        }
//        for (String each : strArr) str2 += each;


//        char [] chArr = str.toCharArray();
//        for (int i = chArr.length-1; i> chArr.length/2; i--){
//            char temp = chArr[chArr.length-1-i];
//            chArr[chArr.length-1-i] = chArr[i];
//            chArr[i] = temp;
//        }
//        for (char each :chArr) str2+=each;


//        System.out.println(Arrays.toString(chArr));
        System.out.println(str2);
    }
}

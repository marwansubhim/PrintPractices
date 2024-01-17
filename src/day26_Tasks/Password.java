package day26_Tasks;

public class Password {
    public static void main(String[] args) {
        String password = "dfp";


        for (String each : password.split(" ")){  // {"d", "f", "p"}

        }
        for (char each : password.toCharArray()){  // {'d', 'f', 'p'}

        }




//        boolean atLeast8Chars = password.length() >= 8;
//        boolean hasUpperCase = false;
//        boolean hasLowerCase = false;
//        boolean hasDigits = false;
//        boolean hasSpecialChar = false;
//
//        for (int i = 0; i<password.length(); i++) {
//            char each = password.charAt(i);
//
//            if (Character.isUpperCase(each)) hasUpperCase = true;
//            else if (Character.isLowerCase(each)) hasLowerCase = true;
//            else if (Character.isDigit(each)) hasDigits = true;
//            else hasSpecialChar = true;
//        }
//        boolean isValid = atLeast8Chars&&hasDigits&&hasLowerCase&&hasUpperCase&&hasSpecialChar;
//        System.out.println(isValid);
    }
}

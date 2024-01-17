package day18_Tasks;

import java.util.Scanner;

/*
write a program that will return the domain of an email address:
            Ex:
                input: test@gmail.com
                output: the domain of the email is: gmail
                inputL: Cybertek@yahoo.com
                output: the domain of the email is: yahoo
 */
public class SubstringTask8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String domain = in.next();
        int beginsWith = domain.indexOf("@")+1;
        int endsWith = domain.indexOf(".");
        System.out.println("Domain of the email is: "+domain.substring(beginsWith,endsWith));
    }
}

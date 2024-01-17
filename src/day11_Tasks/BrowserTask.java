package day11_Tasks;
/*
4. write a program that can display the selected browser
                1. declare a String variable called browserName
                2. Assume that the valid browsers are: chrome, firefox, opera, safari.
                3. if the browser name does not match with the valid browsers' names, out put should be: Invalid Browser Name
             Ex:
                browserName = "chrome";
                output:
                    Chrome Browser is Selected
                browserName =   "cybertek";
                output:
                    Invalid Browser Name
 */
public class BrowserTask {
    public static void main(String[] args) {
        String browserName = "safari";
        if (browserName=="chrome"){
            browserName =" chrome";
        }else if (browserName=="firefox"){
            browserName="firefox";
        }else if (browserName=="opera"){
            browserName = "opera";
        }else if (browserName=="safari"){
            browserName = "safari";
        }else {
            browserName = "Invalid browser name";
        }
        System.out.println(browserName);

    }
}

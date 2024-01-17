package day29_Tasks.RemoteWebDriverTask;

public class Drivers {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver("V102.5");
        System.out.println(driver.maximize());
        System.out.println(driver.get("https://www.google.com"));
        System.out.println(driver.close());
        System.out.println(driver);
        System.out.println("*****************************");
        OperaDriver driver1 = new OperaDriver("V4.5");
        System.out.println(driver1.get("https://www.google.com"));
        System.out.println(driver1.maximize());
        System.out.println(driver1.close());
        System.out.println(driver1);
        System.out.println("******************************");
        EdgeDriver driver2 = new EdgeDriver("V7.85");
        System.out.println(driver2.get("https://www.google.com"));
        System.out.println(driver2.maximize());
        System.out.println(driver2.close());
        System.out.println(driver2);
        System.out.println("********************************");

        SafariDriver driver3 = new SafariDriver("V.HH25.25");
        System.out.println(driver3.get("httpd://www.facebook.com"));
        System.out.println(driver3.maximize());
        System.out.println(driver3.close());
        System.out.println(driver3);
        System.out.println("******************************");
        FireFoxDriver driver4 = new FireFoxDriver("FX112.4");
        System.out.println(driver4.get("https://www.Cybersecurity.com"));
        System.out.println(driver4.maximize());
        System.out.println(driver4.close());
        System.out.println(driver4);
    }
}

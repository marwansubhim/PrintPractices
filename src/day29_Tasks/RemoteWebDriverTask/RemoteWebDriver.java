package day29_Tasks.RemoteWebDriverTask;

public class RemoteWebDriver {
    public String name, version;

    public RemoteWebDriver(String name, String version){
        this.name = name;
        this.version = version;
    }

    public String get(String URL){
        return "Invoking "+URL;
    }

    public String maximize(){
        return "Maximizing window of ";
    }

    public String close(){
        return "Closing window of ";
    }

    @Override
    public String toString() {
        return
                "Name='" + name + '\'' +
                ", Version='" + version
                ;
    }
}
/*
Maximizing window of chrome driver
chrome driver Invoking https://www.google.com
Closing window of chrome driver
Name='chrome', Version='V102.5
*****************************
Opera driver Invoking https://www.google.com
Maximizing window of Opera driver
Closing window of Opera driver
Name='Opera', Version='V4.5
******************************
Edge driver Invoking https://www.google.com
Maximizing window of Edge driver
Closing window of Edge driver
Name='Edge', Version='V7.85
********************************
Safari driver Invoking httpd://www.facebook.com
Maximizing window of Safari driver
Closing window of Safari driver
Name='Safari', Version='V.HH25.25
******************************
FireFox driver Invoking https://www.Cybersecurity.com
Maximizing window of FireFox driver
Closing window of FireFox driver
Name='FireFox', Version='FX112.4

 */
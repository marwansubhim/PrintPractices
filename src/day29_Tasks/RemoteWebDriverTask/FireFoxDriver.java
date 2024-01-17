package day29_Tasks.RemoteWebDriverTask;

public class FireFoxDriver extends RemoteWebDriver{

    public FireFoxDriver(String version){
        super("FireFox",version);
    }

    @Override
    public String get(String URL) {
        return name+" driver "+ super.get(URL);
    }

    @Override
    public String maximize() {
        return super.maximize()+name+" driver";
    }

    @Override
    public String close() {
        return super.close()+name+" driver";
    }
}

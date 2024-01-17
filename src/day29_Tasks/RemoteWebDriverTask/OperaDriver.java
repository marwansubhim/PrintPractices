package day29_Tasks.RemoteWebDriverTask;

public class OperaDriver extends RemoteWebDriver{
    public OperaDriver(String version){
        super("Opera",version);
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
//    public String toString(){
//        return "Name: "+name+", Version: "+version;
//    }We can use the toString that we created or just rely on the one that is inherited from the super class

}

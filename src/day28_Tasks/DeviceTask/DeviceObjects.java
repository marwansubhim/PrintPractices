package day28_Tasks.DeviceTask;

public class DeviceObjects {
    public static void main(String[] args) {

        TV tv = new TV("Samsung","LX32",499.99);
        System.out.println(tv);
        tv.channelUp();
        tv.channelDown();
        tv.turnOn();
        tv.turnOff();

        Phone phone = new Phone("iPhone","12 Pro Max",1200);
        phone.turnOn();
        phone.turnOff();
        phone.call(8322990295L);
        phone.texting(8322990295L);


    }
}
// create another two classes called, computer and radio
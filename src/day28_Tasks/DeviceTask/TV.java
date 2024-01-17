package day28_Tasks.DeviceTask;

public class TV extends Device{

    public static boolean hasChannel, hasCable;
    static {
        hasChannel = true;
        hasCable = true;
    }


    public TV(String brand, String model, double price){
        setInfo("TV", brand, model, price);
    }
}

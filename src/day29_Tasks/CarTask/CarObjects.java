package day29_Tasks.CarTask;

public class CarObjects {
    public static void main(String[] args) {
        Honda honda = new Honda("Civic","Red",23000,2019);
        honda.start();
        System.out.println(honda);
        Mercedes mercedes = new Mercedes("E320","Red",23000,2019);
        mercedes.start();
        System.out.println(mercedes);
        Jeep jeep = new Jeep("XSR32","Red",23000,2019);
        jeep.start();
        System.out.println(jeep);
        Tesla tesla = new Tesla("TDSS34","Red",23000,2019);
        tesla.start();
        System.out.println(tesla);
    }
}

package day28_Tasks.PersonTask;

public class AppleInc {
    public static void main(String[] args) {
        Tester tester = new Tester("Marwan","SDET","313A",34,'M',100);
        Developer developer = new Developer("Mahdi","Software Engineer","32M",8,'M',120);
        tester.eat();
        tester.sleep();
        tester.testing();
        developer.coding();
        System.out.println(tester);
        System.out.println(developer);
    }
}

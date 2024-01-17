package day37_Tasks;

public class TVRoom {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl("remote1");

        System.out.println(remoteControl.toString());
        remoteControl.turnOff();
        remoteControl.turnOn();
        remoteControl.volumeDown();
        remoteControl.volumeUp();

        Nested nested = new Nested("Marwan");

        nested.print();

        System.out.println(nested);

        Nested.Inner inner = new Nested.Inner("Ayder");
        inner.printAgain();
    }
}

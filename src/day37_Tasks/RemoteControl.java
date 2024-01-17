package day37_Tasks;

public class RemoteControl {
   public String name;

   public RemoteControl(String name){
       this.name = name;
   }

   public void turnOn(){
       System.out.println(name+" is turning on");
   }

   public void turnOff(){
       System.out.println(name+" is turning off");
   }

   public void volumeUp(){
       System.out.println(name+" is voluming up");
   }

   public void volumeDown(){
       System.out.println(name+" is voluming down");
   }

    @Override
    public String toString() {
        return "RemoteControl{" +
                "name='" + name + '\'' +
                '}';
    }

}

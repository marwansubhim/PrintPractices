package day33_Tasks.newOne;

public class Phone {
    static int number;
    public Phone(String str){
        this(str.length());
    }
    public Phone(int num){
        this();
        number+=num;
    }
    public Phone(){
        number+=1;
    }
}
class CellPhones{
    public static void main(String[] args) {

        new Phone("iphone");
        new Phone();
        new Phone(4);
        System.out.println(Phone.number);
    }
}
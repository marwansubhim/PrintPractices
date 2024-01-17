package day33_Tasks.newOne;

public class NewOne {
    int count;
    public void m(){
        count++;
    }
    public void m(int n){
        count*=n;
    }

    @Override
    public String toString() {
        return "NewOne{" +
                "count=" + count +
                '}';
    }

    public static void main(String[] args) {
        NewOne newOne = new NewOne();
       newOne.m(5);
       newOne.m();
       newOne.count+=10;
       newOne.m(2);
        System.out.println(newOne);
        NewOne newOne1 = new NewOne();
        System.out.println(newOne==newOne1);
    }
}
class Main{
    static {
        System.out.println(0);
    }
    static void run(){
        System.out.println(1);
    }

    public static void main(String[] args) {
        System.out.println(2);
    }
    static {
        System.out.println(3);
    }

}
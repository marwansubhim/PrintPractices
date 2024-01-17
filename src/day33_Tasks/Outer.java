package day33_Tasks;

public class Outer {


    public String name;
    public Outer(String name){
        this.name = name;
    }

    public static class inner{
        public int num1, num2;
        void print(){
            System.out.println("Inner static class");
        }
    }
}
class testing{
    public static void main(String[] args) {
      Outer outer = new Outer("outer");
      Outer.inner inner = new Outer.inner();

      inner.print();
    }
}
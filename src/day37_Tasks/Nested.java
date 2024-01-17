package day37_Tasks;

public class Nested {

    public String name;
    public Nested(String name){
        this.name = name;
    }
    public void print(){
        System.out.println("hello "+name);
    }

    @Override
    public String toString() {
        return "Nested{" +
                "name='" + name + '\'' +
                '}';
    }

    /*********************************************/
    public static class Inner{
        public int num;
        public String name;

        public Inner(String name){
            this.name = name;
        }

        public void printAgain(){
            System.out.println(name+" hello again");
        }


    }
}

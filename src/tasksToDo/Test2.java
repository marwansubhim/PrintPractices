package tasksToDo;


public class Test2 {

    public int num;
    public char gender;
    public String name;

    public static double PI;

    static {
        PI = 3.14;
    }

    public Test2() {
        this(5,'m',"Ayder");

    }

    public Test2(int num) {
        this();
        this.num = num;
        System.out.println("Hello");
    }

    public Test2(int num, char gender) {
        this(num);
        this.num = num;
        this.gender = gender;

    }

    public Test2(int num, char gender, String name) {
        this.num = num;
        this.gender = gender;
        this.name = name;
    }


    @Override
    public String toString() {
        return "Test2{" +
                "num=" + num +
                ", gender=" + gender +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Test2 test2 = new Test2(34,'M');
        System.out.println(test2);


//        Test2 test = new Test2();
//        Test2 test2 = new Test2(5, 'F');
//        System.out.println(test2.gender);
//        System.out.println(test2.num);
//        System.out.println(test2.PI);
//        System.out.println(test2);
//
//        System.out.println("*******************");
//        System.out.println(test);
//
//        Test2 test21 = new Test2(86);
//        System.out.println(test21);


//        for (int i = 1; i<11 ; i++) {
//            System.out.println("Hello world");
//        }


    }
}

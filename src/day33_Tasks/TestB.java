package day33_Tasks;

public class TestB {
    public String name, fullName;
    public int age;
    private long SSN;

    public static boolean hasEys ;
    public static boolean hasHands;



    public TestB(String name) {
        this.name = name;
    }

    public TestB() {
    }

    public TestB(int age) {
        this.age = age;
    }





    public long getSSN() {
        return SSN;
    }

    public void setSSN(long SSN) {
        this.SSN = SSN;
    }
    public static void sleep() {
        System.out.println("Every one sleeps");
    }

    public void work() {
        System.out.println(name + " is working");
    }

    public void running() {
        System.out.println(name + " is running");
    }

    @Override
    public String toString() {
        return "TestB{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    static {
        hasEys = true;
        hasHands = true;

    }

    public TestB(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public TestB(String name, int age, long SSN) {
        this(name,age);
        setSSN(SSN);
    }
}

class TestAObjects {
    public static void main(String[] args) {

        TestB myInfo = new TestB("Marwan Subhi",32,1234567895);
        TestB testB1 = new TestB();
        TestB testB2 = new TestB();
        TestB testB3 = new TestB();
        TestB testB4 = new TestB();

        testB1.name = "New name";

        System.out.println(testB1.hasEys);
        System.out.println(TestB.hasHands);
        TestB.sleep();



        //testB.setSSN(325648);
        System.out.println(testB1);
        // testB.name =
    }
}


/*
Static members can also be accessed from
the object if its states and behaviors are in the same class, but It is NOT recommended
 */

//ClassName  objectName = new ClassConstructor();

//How is this used
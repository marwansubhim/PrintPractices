package day32_Tasks;

public class Test {
    String name;
    int age;

    public Test(String name) {
        this.name = name;
    }
    public Test(int age) {
        this.age = age;
    }

    private static String msg;

    static {
        msg = "Geeks";
    }
    public String goodMessage = "Hello Friends";

    public static class myClass {
        public void print() {
            System.out.println(msg);
        }
        public static class thirdOne{
            void print(){
                System.out.println(msg);
            }
        }
        public static class forthOne{
            void print(){
                System.out.println(msg+" hello again");
            }
        }
    }

    public class inner {
        public int multiply(int a, int b) {
            return a * b;
        }

        public void printMe(String str) {
            System.out.println(str);
        }
        public class newOne{
            public void print(){
                System.out.println("Good job");
            }
        }


    }
}

class main {
    public static void main(String[] args) {

        Test.myClass myClass = new Test.myClass();
        myClass.print();
        Test.inner test = new Test("Hi").new inner();
        test.printMe("Hello");
        Test.myClass test1 = new Test.myClass();
        Test.inner inner = new Test("Hello").new inner();
        System.out.println(test.multiply(2, 5));
        System.out.println(Test.myClass.class.isMemberClass());
        System.out.println("**********************************");
        Test.myClass.forthOne forthOne = new Test.myClass.forthOne();
        Test.inner.newOne inner1 = new Test("Marwan").new inner().new newOne();
        inner1.print();
    }
}

/*

Static class in Java
Difficulty Level : Medium
Last Updated : 19 Feb, 2020
Can a class be static in Java?
The answer is Yes, some classes can be made static in Java. Java supports Static Instance Variables, Static Methods,
Static Block and Static Classes
Java allows a class to be defined within another class. These are called Nested Classes.
The class in which the nested class is defined is known as the Outer Class. Unlike top level classes,
Inner classes can be Static. Non-static nested classes are also known as Inner classes.

An instance of an inner class cannot be created without an instance of the outer class. Therefore,
an inner class instance can access all of the members of its outer class, without using a reference to the outer class instance.
For this reason inner classes can help make programs simple and concise.


// Java program to demonstrate how to
// implement static and non-static
// classes in a Java program.
class OuterClass {
    private static String msg = "GeeksForGeeks";

    // Static nested class
    public static class NestedStaticClass {

        // Only static members of Outer class
        // is directly accessible in nested
        // static class
        public void printMessage()
        {

            // Try making 'message' a non-static
            // variable, there will be compiler error
            System.out.println(
                "Message from nested static class: "
                + msg);
        }
    }

    // Non-static nested class -
    // also called Inner class
    public class InnerClass {

        // Both static and non-static members
        // of Outer class are accessible in
        // this Inner class
        public void display()
        {
            System.out.println(
                "Message from non-static nested class: "
                + msg);
        }
    }
}
class Main {
    // How to create instance of static
    // and non static nested class?
    public static void main(String args[])
    {

        // Create instance of nested Static class
        OuterClass.NestedStaticClass printer
            = new OuterClass.NestedStaticClass();

        // Call non static method of nested
        // static class
        printer.printMessage();

        // In order to create instance of
        // Inner class we need an Outer class
        // instance. Let us create Outer class
        // instance for creating
        // non-static nested class
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner
            = outer.new InnerClass();

        // Calling non-static method of Inner class
        inner.display();

        // We can also combine above steps in one
        // step to create instance of Inner class
        OuterClass.InnerClass innerObject
            = new OuterClass().new InnerClass();

        // Similarly we can now call Inner class method
        innerObject.display();
    }
}
 */
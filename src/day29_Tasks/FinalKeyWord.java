package day29_Tasks;

import java.time.LocalDateTime;

class Parent{
    public final void method(){
        System.out.println("Method A");
    }
}

public class FinalKeyWord extends Parent{


    public void method(int a){
        System.out.println("Method B"+a);
    }

    public final static int z = 200;

    public  static void main(String[] args) {

        System.out.println(z);
    }
        LocalDateTime dateTime = LocalDateTime.of(2012,5,3,5,30);

}

//class D extends String{
//
//}

// final variables are considered to be constant
// final variables can not be overridden or overwritten
// final variable needs to be initialized when declared
// final variables can not be reassigned
// final methods can be overloaded but can not be overridden
// final methods can never be overridden
// Main method can be final and it doesn't affect anything since its a static and we are not going to override it
// Instance methods are the ones we can overwrite or override
// If we give the keyword final to the class we are making it constant and therefore the class and its variables and methods will become constants and immutable. and can not be overridden
// final class can be subClass "child" BUT CAN NEVER be a Parent class
// If we have a class and we don't want the class with its variables and methods we will have to make the class immutable by providing the final keyword ni the class decliration.
// Any method that we have have no desire to override it we can give the final keyword, final methods can never be overwritten or overridden

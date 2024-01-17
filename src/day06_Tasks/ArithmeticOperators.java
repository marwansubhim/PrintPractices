package day06_Tasks;

public class ArithmeticOperators {
    public static void main(String[] args) {
        int outcome = 12 + 6 / 3;
        System.out.println(outcome);
        int value = 5 + 2*4;
        System.out.println(value);
        value = 10/2-3;
        System.out.println(value);
        value= 8 + 12 * 2 - 4;
        System.out.println(value);
        value = 4 + 17 % 2-1;
        System.out.println(value);
        value = 7 - 1;
        System.out.println(value);
        System.out.println("************\n");
        value = ( 5+ 2) *4;
        System.out.println(value);
        value = 10 / (5-3);
        System.out.println(value);
        value = 8 + 12 * (6 - 2 );
        System.out.println(value);
        value = (4 + 17 ) % 8-1;
        System.out.println(value);
        value = 8 - 3 * 2 + 7 / 3;
        System.out.println(value);

        int num1  = 40;
        int num2 = 60;
        int sum = num1+num2;
        System.out.println(sum);
        System.out.println("*************");

        double cel = 10;
        double feh = 9 * (cel/5) +32;
        System.out.println(feh);
        System.out.println("**************");

        double mile = 50;
        double kilo = mile*1.609344;
        System.out.println(kilo);
        System.out.println("***************");

        double radius  = 5.5 ;
        double areaOfCircle = radius*radius*3.14;
        double perimeterOfCircle = 2 * 3.14 * radius;
        System.out.println("Area of the circle is "+areaOfCircle+"\nPerimeter of circle is "+perimeterOfCircle);
        System.out.println("****************");

        double width = 4.5;
        double height = 7.9;
        double areaOfRectangle = width*height;
        System.out.println("Area of rectangle is "+areaOfCircle);

        System.out.println("********************");

        double num6 = 8;
        double num8 = 15;
        double num12 = 50;
        double average = (num6+num8+num12)/3;
        System.out.println("Average value is "+average);






    }
}

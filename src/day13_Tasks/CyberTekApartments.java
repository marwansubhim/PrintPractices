package day13_Tasks;
/*
In this assignment, you will write program for Leasing office.

numberOfBedrooms variable already declared and assigned value using Scanner:
startingPrice is set to 0.

Using Multi Way If statement create this program logic:
numberOfBedrooms is 1
	print "One Bedroom Selected"
	set startingPrice as 1100

numberOfBedrooms is 2
	print "Two Bedroom Selected"
	set startingPrice as 1850

numberOfBedrooms is 3
	print "Three Bedroom Selected"
	set startingPrice as 2550

All other inputs:
	print "No such Bedrooms available"


Print "Starting Price: value"


 */
public class CyberTekApartments {
    public static void main(String[] args) {
        int numberOfBedrooms = 1;
        int startingPrice = 0;

            if (numberOfBedrooms==1){
                System.out.println("One Bedroom Selected");
                startingPrice=1100;
                System.out.println("Starting Price: "+startingPrice);
            }else if (numberOfBedrooms==2){
                System.out.println("Two Bedroom Selected");
                startingPrice=1850;
                System.out.println("Starting Price: "+startingPrice);
            }else if (numberOfBedrooms==3){
                System.out.println("Three Bedroom Selected");
                startingPrice=2550;
                System.out.println("Starting Price: "+startingPrice);
            }else System.out.println("No such Bedrooms available\nStarting Price: 0");
            int x =0;
            int y = x>=5? x: -x;
        System.out.println(x);
            int num1 = 0;
            int num2 = 5;

            int value = num1>num2? num1: num2;
        System.out.println(value);

    }
}

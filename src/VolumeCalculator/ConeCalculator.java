package VolumeCalculator;

public class ConeCalculator {
    public static void main(String[] args) {
        int radius = 5;
        int height = 10;
        double area = radius*radius*3.14;
        double volume = (3.14*radius*radius*height)/3;
        System.out.println("Area of the cone is "+area+"cm^2\nVolume of Cone is "+volume+"cm^3");
    }
}

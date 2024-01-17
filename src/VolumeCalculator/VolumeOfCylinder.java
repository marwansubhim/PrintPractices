package VolumeCalculator;

public class VolumeOfCylinder {
    public static void main(String[] args) {

        // volume of cylinder = pi * r^2 * h
        // area of cylinder = 2.pi.r.h + 2.pi.r^2
        // h = 7.5 meter, r = 2.5 meter

        // volume of circular cone = 1/3 * pi * r ^2 * h
        //  surface area of right circular cone = pi.r.s + pi.r^2
        // s^2 = r^2 + h^2
        // r = 3.5 meter, h = 5.5 meter, s =

        double radiusOfCylinder = 48.5;
        double heightOfCylinder = 78.5;
        double areaOfCylinder = (2*Math.PI*radiusOfCylinder*heightOfCylinder)+(2*Math.PI*radiusOfCylinder*radiusOfCylinder);
        double volumeOfCylinder = radiusOfCylinder*radiusOfCylinder*Math.PI*heightOfCylinder;
        double radiusOfCone = 36.5;
        double heightOfCone = 54.5;
        double sideOfCone = Math.sqrt(radiusOfCone*radiusOfCone+heightOfCone*heightOfCone);
        System.out.println(sideOfCone);
        double areaOfCone = (Math.PI*radiusOfCone*sideOfCone)+Math.PI*radiusOfCone*radiusOfCone;
        double OfCone = Math.PI*radiusOfCone*radiusOfCone*heightOfCone;
        double volumeOfCone = OfCone/3;

        System.out.println("\tVolumes\nVolume of Cylinder = "+volumeOfCylinder+"\nVolume of Cone = "+volumeOfCone+"\n\tAreas\nArea of Cylinder = "+areaOfCylinder+"\nArea of Cone = "+areaOfCone);


    }

}

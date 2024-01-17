package day14_Tasks;

public class ArraysIntro {
    public static void main(String[] args) {

        //int[]  num = new int[3];
        int num [] = new int[]{2,3,8,4};
        String[] names = new String[]{"Marwan", "Mahdi", "Majd", "Manara"};
        num[0] = 2;
        num[1] = 3;
        num[2] = 8;
        num[3] = 4;
        System.out.println("num1 = "+num[0]+"\nnum2 = "+num[1]+"\nnum3 = "+num[2]+"\nnum4 = "+num[3]);
        System.out.println("************************");
        System.out.println("Father: "+names[0]+"\nFirst Son: "+names[1]);
        System.out.println("Mother: "+names[3]+"\nSecond Son: "+names[2]);
//        String[] names = {"Marwan", "Mahdi", "Majd", "Manara"};
//        for (int i=0; i < names.length(); i++){
//
//        }


        for (int i=0; i <100; i++){

                if (i%2==0){
                    System.out.print(i+" ");

            }

        }
    }
}

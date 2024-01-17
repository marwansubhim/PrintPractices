package day17_Tasks;


import java.util.Scanner;

public class DoctorAppointment_Task {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String state ;
        boolean insurance;

        System.out.println("How many days have you been sick");
        byte days = in.nextByte();
        in.nextLine();
        if (days>=1&&days<=3){
           state="Drink water and get some rest, but we can schedule an appointment for next week";
        }else if (days>=4&&days<=7){
            state = "We can schedule an appointment for two days";
        }else state = "Come in immediately";
        System.out.println(state);
        System.out.println("are you taking any medications? ");
        String takingMedicine = in.nextLine();
        if (takingMedicine.equalsIgnoreCase("yes")){
            System.out.println("We can prescribe medicine after the appointment");
        }if (takingMedicine.equalsIgnoreCase("no")){
            System.out.println("Eat some soup");
        }
        System.out.println("Do you have insurance? ");
        insurance = in.nextBoolean();
        if (insurance){
            System.out.println("Okay see you at the appointment");
        }else {
            System.out.println("Okay we can discuss payment after the appointment");
        }
    }
}

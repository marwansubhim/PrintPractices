package day15_Scanner;
/*
1) Given a number of people on the ship determine how many need to be crew members and how many can be passengers. Print how many of each type there should be.
    Total: 50 | 20 crew, 30 passengers
    Total: 75 | 25 crew, 50 passengers
    Total: 100 | 30 crew, 70 passengers
    Any other number of people on the ship is not valid

 */
public class Warmup {
    public static void main(String[] args) {
        int numberOfPeople = 0;
        int crew = 1;
        int passengers = 0;
        switch (numberOfPeople){
            case 50: crew = 20; passengers = 30; break;
            case 75: crew = 25; passengers = 50; break;
            case 100: crew = 30; passengers = 70; break;
            default:
                System.out.println("Invalid number of people");
        }
        System.out.println("Crew: " + crew);
        System.out.println("Passengers: " + passengers);

    }
}

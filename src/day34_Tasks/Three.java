package day34_Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Three {
    public static void main(String[] args) {

        One o1 = new One("Marwan",32541);
        One o2 = new One("Mohammad",85641);
        One o3 = new One("Murad",96558);
        One t1 = new Two("Mahdi",85421,"35 highland rd");
        Two t2 = new Two("Majd",988558,"35 Bechnut rd");
        Two t3 = new Two("Manara",411475,"65 highland ave");
        Two t4 = new Two("Marwa",3221001,"35 houston st");
        One o6 = new Two("Muhtar",32541,"11355 Richmond ave");

        One[] staff = {o1,o2,t1, o3, t2,t3,t4,o6};
        ArrayList<One> list = new ArrayList<>(Arrays.asList(staff));

        System.out.println(list);
    }
}

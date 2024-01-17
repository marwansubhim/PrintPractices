package day25_Tasks;

public class Practice {
    public static void main(String[] args) {
        String name = "Group18";
        String str = "B21 ";
        //             0 1 2
        System.out.println( str.concat(name));

        System.out.println(name.charAt(2));
        System.out.println(name.indexOf('G'));
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        System.out.println("*********************");

        String subs = "I like to work hard with my friends";

//        System.out.println(subs.substring(0,subs.indexOf(" wi")));
//        System.out.println(subs.substring(5));
       // System.out.println(subs.replace("m","w"));

        System.out.println(subs.length()-1);
        System.out.println(subs.lastIndexOf(" like"));

        System.out.println("*/*********");


        for (int i = 0; i<4; ){
            i++;

            System.out.println(i);
            System.out.println("hello");


        }

        int j = 0;
        while (j<3){
            System.out.println("Hello Friends");
            j++;
        }
        System.out.println(j);

        do {j++;
            System.out.println("hello group18");

        }while (j<6);
    }
}

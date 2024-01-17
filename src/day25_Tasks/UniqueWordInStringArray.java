package day25_Tasks;

public class UniqueWordInStringArray {
    public static void main(String[] args) {

        String [] names = {"C#", "Java", "C#", "Python", "Python", "Ruby", "Swift", "C++", "Swift", "C#"};

        System.out.println("Using for loop");

        for (int j = 0; j<names.length; j++){
            int count = 0;
            String element = names[j];
            for (int  i = 0; i<names.length; i++){
                if (names[i]==element){
                    count++;
                }
            }if (count==1){
                System.out.println(element);
            }
        }
        System.out.println("=================");

        System.out.println("Using for each loop");

        String element = names[0];

        for (String ch1 : names){
            int j =0;
            for (String ch: names){
                if (ch==ch1) j++;
            } if (j==1) System.out.println(ch1);
        }

    }
}


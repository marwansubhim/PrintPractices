package day34_Tasks;

public class One  {
    public One(String name, int num) {
        this.name = name;
        this.num = num;
    }

    String name;
    int num;
    void printMessage(){

        System.out.println("Hello "+name);
    }



    @Override
    public String toString() {
        return "One{" +
                "name='" + name + '\'' +
                ", num=" + num +
                '}';
    }
}







class Main{
    public static void main(String[] args) {
        String a = "hello marwan, how are you doing sir";
        String b = "aab";
        String c = "ab";
        char d = 'a';
        char d1 = 'b';

        System.out.println((int) d);
        System.out.println((int) d1);
        int result = b.compareToIgnoreCase(c);
        System.out.println(result);
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(c.hashCode());
        int count = 0;
        for (int i = 0; i<a.length(); i++){
            if (Character.isWhitespace(a.charAt(i)))count++;
        }
        System.out.println("Number of words = "+(count+1));
    }
}
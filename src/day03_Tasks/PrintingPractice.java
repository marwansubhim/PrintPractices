package day03_Tasks;

public class PrintingPractice {

    public static void main (String [] args){

       /*
       * '\n'  : New line       :     Advances the cursor to the next line for subsequent printing
       * '\t'  : Horizontal Tab :     Causes the cursor to skip over to the next stop
       * '\\'  : Backslash      :     Causes a backslash to be printed
       * '\''  : Single quote   :     Causes a single quotation ,ark to be printed
       * '\"'  : Double quote   :     Causes a double quotation mark to be printed
       * */



        System.out.print ("Hello world ");
        System.out.print("How are you ");
        System.out.print("Hope you"+'\t'+"are you doing good");
        System.out.println();
        System.out.println("Hello"+'\t'+ " Hope everything going well");
        System.out.println();
        System.out.println("I just wanted to double check with you"+'\\'+" thank god you are doing so much better");
        System.out.println();
        System.out.println(" Hello"+'\''+"there");
        System.out.println("come one more time"+'\"'+" now"+'\n');
        System.out.println("That was really good");
    }
}

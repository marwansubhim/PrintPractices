package day05_Tasks;

public class LiraToUSD {
    public static void main(String[] args) {
        double LiraToUsdRate = 160969.70/1000000;
        int lira = 1000000;
        double LiraToUSD = lira*LiraToUsdRate;
        System.out.println(lira+" Lira is equal to "+LiraToUSD+" USD");
    }
}

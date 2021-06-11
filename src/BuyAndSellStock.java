import java.util.Scanner;

public class BuyAndSellStock {
    // if only one transaction allowed
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0;i < arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int leastValue = Integer.MAX_VALUE;
        int overallProfit = 0;
        int todaySellProfit;
        for (int j : arr) {
            if (j < leastValue) {
                leastValue = j;
            }
            todaySellProfit = j - leastValue;
            if (todaySellProfit > overallProfit) {
                overallProfit = todaySellProfit;
            }
        }
        System.out.println(overallProfit);
    }
}

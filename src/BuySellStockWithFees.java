import java.util.Scanner;

public class BuySellStockWithFees {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0;i < arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int fee = sc.nextInt();
        int buyStateProfit = - arr[0];
        int sellStateProfit = 0;
        for (int i = 1;i < arr.length;i++){
            int newBuyStateProfit;
            int newSellStateProfit;
            // for buy
            newBuyStateProfit = Math.max(sellStateProfit - arr[i], buyStateProfit);
            // for sell
            newSellStateProfit = Math.max(arr[i] + buyStateProfit - fee, sellStateProfit);
            buyStateProfit = newBuyStateProfit;
            sellStateProfit = newSellStateProfit;
        }
        System.out.println(sellStateProfit);
    }
}

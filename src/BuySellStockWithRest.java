import java.util.Scanner;

public class BuySellStockWithRest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0;i < arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int bsp = - arr[0];
        int ssp = 0;
        int csp = 0;
        for (int i = 1;i < arr.length;i++){
            int nbsp;
            int nssp;
            int ncsp;
            // for buy
            nbsp = Math.max(csp - arr[i], bsp);
            // for sell
            nssp = Math.max(arr[i] + bsp, ssp);
            // for cool down
            ncsp = Math.max(ssp, csp);
            bsp = nbsp;
            ssp = nssp;
            csp = ncsp;
        }
        System.out.println(ssp);
    }
}

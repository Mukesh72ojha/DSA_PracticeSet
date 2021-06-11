import java.util.Scanner;

public class UnboundedKnapsack {
    public static void main(String[] ars){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] value = new int[n];
        int[] weight = new int[n];
        for(int i = 0;i < value.length;i++){
            value[i] = sc.nextInt();
        }
        for(int i = 0;i < weight.length;i++){
            weight[i] = sc.nextInt();
        }
        int cap = sc.nextInt();
        int[] res = new int[cap+1];
        res[0] = 0;
        // first loop for cap array
        for (int i = 1;i < res.length;i++){
            // for storing max value
            int max = 0;
            // second loop for value or weight
            for (int j = 0;j < value.length;j++){
                if (weight[j] <= i){
                    int remBagCap = i - weight[j];
                    int remBagVal = res[remBagCap];
                    int totBagVal = remBagVal + value[j];
                    if (totBagVal > max){
                        max = totBagVal;
                    }
                }
            }
            res[i] = max;
        }
        System.out.println(res[cap]);
    }
}

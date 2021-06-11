import java.util.Scanner;

public class ZeroOneKnapsack {
    // bag capacity or batting players questions also included
    public static void main(String[] args){
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
        int[][] result = new int[n + 1][cap + 1];
        // i stand for weight and value or balls and runs
        for(int i = 1;i < result.length;i++){
            // j stand for capacity of bag or balls in cricket
            for(int j = 1;j < result[0].length;j++){
                if(j >= weight[i-1]){
                    int restCap = j - weight[i-1];
                    result[i][j] = Math.max(result[i - 1][restCap] + value[i - 1], result[i - 1][j]);
                }else{
                    result[i][j] = result[i-1][j];
                }
            }
        }
        System.out.println(result[n][cap]);
    }
}

import java.util.Scanner;

public class ClimbStairWithMinMoves {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0;i < arr.length;i++){
            arr[i] = sc.nextInt();
        }
        Integer[] arr2 = new Integer[n+1];
        arr2[n] = 0;
        for (int i = n-1;i >= 0;i--){
            if (arr[i] > 0){
                int min = Integer.MAX_VALUE;
                for (int j = 1;j <= arr[i] && i+j < arr2.length;j++){
                    if (arr2[i+j] != null){
                        min = Math.min(min,arr2[i+j]);
                    }
                }
                if (min != Integer.MAX_VALUE){
                    arr2[i] = min+1;
                }
            }
        }
        System.out.println(arr2[0]);
    }
}

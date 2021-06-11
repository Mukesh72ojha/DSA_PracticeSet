import java.util.Scanner;

public class RainWaterTrapping {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0;i < arr.length;i++){
            arr[i] = sc.nextInt();
        }
        if (arr.length == 0){
            return;
        }
        int[] left = new int[n];
        int[] right = new int[n];
        right[n - 1] = arr[n - 1];
        left[0] = arr[0];
        for (int i = 1;i < arr.length;i++){
            left[i] = Math.max(arr[i], left[i - 1]);
        }
        for (int i = arr.length - 2;i >= 0;i--){
            right[i] = Math.max(arr[i], right[i + 1]);
        }
        int res = 0;
        for (int i = 0;i < arr.length;i++){
            int min = Math.min(left[i],right[i] );
            res = res + min - arr[i];
        }
        System.out.println(res);
    }
}

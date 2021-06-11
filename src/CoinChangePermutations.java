import java.util.Scanner;

public class CoinChangePermutations {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0;i < arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int amt = sc.nextInt();
        int[] arr1 = new int[amt+1];
        arr1[0] = 1;
        // for arr1 to store data and return last index result
        for (int i = 1;i < arr1.length;i++){
            // for arr to get data one by one and compare with arr1's index
            for (int k : arr) {
                if (k <= i) {
                    arr1[i] = arr1[i] + arr1[i - k];
                }
            }
        }
        System.out.println(arr1[amt]);
    }
}

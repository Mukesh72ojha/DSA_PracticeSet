import java.util.Scanner;

public class CoinChangeCombination {
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
        // for get value from arr
        for (int k : arr) {
            // Start loop in arr1 from value of arr[i] for get combination value
            for (int j = k; j < arr1.length; j++) {
                arr1[j] = arr1[j] + arr1[j - k];
            }
        }
        System.out.println(arr1[arr1.length-1]);
    }
}

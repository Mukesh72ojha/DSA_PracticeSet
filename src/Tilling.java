import java.util.Scanner;

public class Tilling {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n+1];
        for (int i = 1;i <= n;i++){
            if (i < m){
                arr[i] = 1;
            }else if (i == m){
                arr[i] = 2;
            }else {
                arr[i] = arr[i-1] + arr[i-m];
            }
        }
        System.out.println(arr[n]);
    }
}

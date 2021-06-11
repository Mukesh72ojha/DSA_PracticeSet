import java.util.Scanner;

public class PaintHouseRGB {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][3];
        for(int i = 0;i < arr.length;i++){
            for(int j = 0;j < arr[0].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        long[][] arr1 = new long[n][3];
        arr1[0][0] = arr[0][0];
        arr1[0][1] = arr[0][1];
        arr1[0][2] = arr[0][2];
        for(int i = 1;i < arr.length;i++){
            arr1[i][0] = arr[i][0] + Math.min(arr1[i-1][1],arr1[i-1][2]);
            arr1[i][1] = arr[i][1] + Math.min(arr1[i-1][0],arr1[i-1][2]);
            arr1[i][2] = arr[i][2] + Math.min(arr1[i-1][0],arr1[i-1][1]);
        }
        long ans = Math.min(arr1[n-1][0],Math.min(arr1[n-1][1],arr1[n-1][2]));
        System.out.println(ans);
    }
}

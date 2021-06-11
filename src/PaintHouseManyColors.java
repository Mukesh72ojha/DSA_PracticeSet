import java.util.Scanner;

public class PaintHouseManyColors {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int house = sc.nextInt();
        int colors = sc.nextInt();
        int[][] arr = new int[house][colors];
        for (int i = 0; i < arr.length;i++){
            for (int j = 0;j < arr[0].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int[][] arr1 = new int[house][colors];
        int l1 = Integer.MAX_VALUE;
        int l2 = Integer.MAX_VALUE;
        for (int i = 0;i < arr1[0].length;i++){
            arr1[0][i] = arr[0][i];
            if(arr1[0][i] <= l1){
                l2 = l1;
                l1 = arr1[0][i];
            }else if (arr1[0][i] <= l2){
                l2 = arr1[0][i];
            }
        }
        for (int i = 1;i < arr1.length;i++){
            int newL1 = Integer.MAX_VALUE;
            int newL2 = Integer.MAX_VALUE;
            for (int j = 0;j < arr1[0].length;j++){
                if (l1 == arr1[i-1][j]){
                    arr1[i][j] = arr[i][j] + l2;
                }else arr1[i][j] = arr[i][j] + l1;
                if (arr1[i][j] <= newL1){
                    newL2 = newL1;
                    newL1 = arr1[i][j];
                }else if (arr1[i][j] <= newL2){
                    newL2 = arr1[i][j];
                }
            }
            l1 = newL1;
            l2 = newL2;
        }
        System.out.println(l1);
    }
}

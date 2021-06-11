import java.util.Scanner;

public class TargetSumSubset {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0;i < arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int tar = sc.nextInt();
        boolean[][] arr1 = new boolean[n+1][tar+1];
        for (int i = 0;i < arr1.length;i++){
            for (int j = 0;j < arr1[0].length;j++){
                // for arr1[0][0];
                if (i == 0 && j == 0){
                    arr1[i][j] = true;
                }
                // for first row.
                else if (i == 0){
                    arr1[i][j] = false;
                }
                // for first column
                else if (j == 0){
                    arr1[i][j] = true;
                }
                // for rest solutions
                else {
                    // just look up from your positions
                    if (arr1[i - 1][j]){
                        arr1[i][j] = true;
                    }
                    // then look left side and up also
                    else {
                        // because actual index is i -1 in arr
                        int val = arr[i-1];
                        // value of j should greater or equal then val for YES otherwise NO
                        if (j >= val){
                            if (arr1[i - 1][j - val]){
                                arr1[i][j] = true;
                            }
                        }
                    }
                }
            }
        }
        // print last block of arr1
        System.out.println(arr1[arr.length][tar]);
    }
}

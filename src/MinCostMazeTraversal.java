import java.util.Scanner;

public class MinCostMazeTraversal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        for (int i = 0;i < arr.length;i++){
            for (int j = 0;j < arr[0].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        // 1. Storage and meaning assign.
        // 2. Direction of problems that is easy to hard
        // 3. Travel and solve
        int[][] arr2 = new int[r][c];
        for (int i = arr.length-1;i >= 0;i--){
            for (int j = arr[0].length-1;j >=0;j--){
                // When on last row and column
                if (i == arr2.length-1 && j == arr2[0].length-1){
                    arr2[i][j] = arr[i][j];
                }
                // When on last row
                else if (i == arr2.length-1){
                    arr2[i][j] = arr2[i][j+1] + arr[i][j];
                }
                // When on last column
                else if (j == arr2[0].length-1){
                    arr2[i][j] = arr2[i+1][j] + arr[i][j];
                }
                // For rest
                else {
                    arr2[i][j] = Math.min(arr2[i+1][j],arr2[i][j+1]) + arr[i][j];
                }
            }
        }
        // Finally on arr2[0][0] our result will be store.
        System.out.println(arr2[0][0]);
    }
}

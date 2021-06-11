import java.util.Scanner;

public class PathWithMaxGoldCollection {
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
        for (int j = arr2[0].length - 1;j >= 0;j--){
            for (int i = arr2.length - 1;i >= 0;i--){
                // When in last column.
                if (j == arr2[0].length -1){
                    arr2[i][j] = arr[i][j];
                }
                // When in last row.
                else if (i == arr2.length -1){
                    arr2[i][j] = arr[i][j] + Math.max(arr2[i][j+1],arr2[i-1][j+1]);
                }
                // When in 0th row
                else if (i == 0){
                    arr2[i][j] = arr[i][j] + Math.max(arr2[i][j+1],arr2[i+1][j+1]);
                }
                // for rest solutions
                else {
                    int max = Math.max(arr2[i-1][j+1],arr2[i][j+1]);
                    arr2[i][j] = arr[i][j] + Math.max(max,arr2[i+1][j+1]);
                }
            }
        }
        int maximum = arr2[0][0];
        for (int i = 1;i < arr2.length;i++){
            if (arr2[i][0] > maximum){
                maximum = arr2[i][0];
            }
        }
        System.out.println(maximum);
    }
}

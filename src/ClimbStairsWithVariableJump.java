import java.util.Scanner;

public class ClimbStairsWithVariableJump {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0;i < arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int[] arr2 = new int[num+1];
        arr2[num] = 1;
        for (int i = num-1;i >= 0;i--){
            for (int j = 1;j <= arr[i] && i+j < arr2.length;j++){
                arr2[i] = arr2[i] + arr2[i+j];
            }
        }
        System.out.println(arr2[0]);
    }
}

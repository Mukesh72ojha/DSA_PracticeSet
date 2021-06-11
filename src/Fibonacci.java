import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int res = fibonacciNumbers(num,new int[num+1]);
        System.out.println(res);
    }
    public static int fibonacciNumbers(int n,int[] arr){
        if (n == 1 || n == 0){
            return n;
        }
        if (arr[n] != 0){
            return arr[n];
        }
        int sum1 = fibonacciNumbers(n - 1,arr);
        int sum2 = fibonacciNumbers(n - 2,arr);
        int Sum = sum1 + sum2;
        arr[n] = Sum;
        return Sum;
    }
}

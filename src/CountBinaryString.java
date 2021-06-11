import java.util.Scanner;

public class CountBinaryString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // using array
        int[] zero = new int[n+1]; // for zero
        int[] one = new int[n+1]; // for one
        zero[1] = 1;
        one[1] = 1;
        for (int i = 2;i <= n;i++){
            zero[i] = one[i-1];
            one[i] = zero[i-1] + one[i-1];
        }
        System.out.println(zero[n] + one[n]);
        // without using array
        int oldCountZero = 1;
        int oldCountOne = 1;
        for (int i = 2;i <= n;i++){
            int newCountZero = oldCountOne;
            oldCountOne = oldCountOne + oldCountZero;
            oldCountZero = newCountZero;
        }
        System.out.println(oldCountOne + oldCountZero);
    }
}

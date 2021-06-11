import java.util.Scanner;

public class ClimbStairs {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int stairs = sc.nextInt();
        int res = climb(stairs,new int[stairs+1]);
        System.out.println(res);
    }
    public static int climb(int num,int[] ans){
        if (num == 0){
            return 1;
        }else if (num < 0){
            return 0;
        }
        if (ans[num] != 0){
            return ans[num];
        }
        int path1 = climb(num - 1,ans);
        int path2 = climb(num - 2,ans);
        int path3 = climb(num - 3,ans);
        int path = path1+path2+path3;
        ans[num] = path;
        return path;
    }
}

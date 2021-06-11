import java.util.Scanner;

public class PartitionIntoSubsets {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int players = sc.nextInt();
        int team = sc.nextInt();
        long[][] arr = new long[team + 1][players + 1];
        for(int i = 0;i <= team;i++){
            for(int j = 0;j <= players;j++){
                if(i == 0 || j == 0 || j < i){
                    arr[i][j] = 0;
                }else if(i == j){
                    arr[i][j] = 1;
                }else{
                    arr[i][j] = arr[i][j-1] * i + arr[i-1][j-1];
                }
            }
        }
        System.out.println(arr[team][players]);
    }
}

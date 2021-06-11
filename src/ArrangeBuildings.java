import java.util.Scanner;

public class ArrangeBuildings {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int oldBuildings = 1;
        int oldSpace = 1;
        for (int i = 2;i <= n;i++){
            int newCountZero = oldSpace;
            oldSpace = oldSpace + oldBuildings;
            oldBuildings = newCountZero;
        }
        System.out.println((oldSpace + oldBuildings) * (oldSpace + oldBuildings));
    }
}

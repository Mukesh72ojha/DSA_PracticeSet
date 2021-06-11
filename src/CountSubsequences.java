import java.util.Scanner;

// count only those subsequences which has a+b+c nature
public class CountSubsequences {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int a = 0, b = 0, c = 0;
        for (int i = 0;i < str.length();i++){
            if (str.charAt(i) == 'a'){
                a = 2 * a + 1;
            }else if (str.charAt(i) == 'b'){
                b = 2 * b + a;
            }else if (str.charAt(i) == 'c'){
                c = 2 * c + b;
            }
        }
        System.out.println(c);
    }
}

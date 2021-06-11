import java.util.Scanner;

public class CountEncodings {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int[] arr = new int[str.length()];
        arr[0] = 1;
        for (int i = 1;i < arr.length;i++){
            // we have 4 major cases
            // if both value is 00 in last
            if (str.charAt(i) == '0' && str.charAt(i-1) == '0'){
                arr[i] = 0;
            }
            // if value is non zero and zero
            else if (str.charAt(i) != '0' && str.charAt(i-1) == '0'){
                arr[i] = arr[i-1];
            }
            // if value is zero and non zero
            else if (str.charAt(i) == '0' && str.charAt(i-1) != '0'){
                // i-1 should be 2 or 1 for 26 value
                if (str.charAt(i-1) == '2' || str.charAt(i-1) == '1'){
                    arr[i] = (i >= 2 ? arr[i-2] : 1);
                }else arr[i] = 0;
            }
            // if both value is non zero
            else {
                // check i-1,i+1 is equal or less from 26
                if (Integer.parseInt(str.substring(i-1,i+1)) <= 26){
                    arr[i] = arr[i-1] + (2 <= i ? arr[i-2] : 1);
                }else arr[i] = arr[i-1];
            }
        }
        System.out.println(arr[str.length()-1]);
    }
}

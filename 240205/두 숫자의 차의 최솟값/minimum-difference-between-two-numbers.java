import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        int minVal = Integer.MAX_VALUE;
        for(int i = 0 ; i < n ; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 1; i < n; i++) {
            if( arr[i] - arr[i-1] < minVal) {
                minVal = arr[i] - arr[i-1];
            }
        }
        System.out.println(minVal);
    }
}
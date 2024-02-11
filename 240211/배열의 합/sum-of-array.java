import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = 4;
        int[][] arr = new int[n][n];
        for(int i = 0 ; i < n; i++) {
            for(int j = 0 ; j < n ; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int sum = 0 ; 
        for(int i= 0;  i < n ; i++) {
            for(int j = 0 ; j < n ;j++) {
                sum += arr[i][j];
            }
            System.out.printf("%d\n", sum);
            sum = 0;
        }
    }
}
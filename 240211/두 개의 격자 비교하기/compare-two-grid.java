import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        int[][] arr2 = new int[n][m];
        for(int i = 0; i < n ; i++) {
            for(int j = 0 ; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < n ; i++) {
            for(int j = 0 ; j < n; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < n ; i++) {
            for(int j = 0 ; j < n; j++) {
                if(arr[i][j] == arr2[i][j]) {
                    System.out.printf("0 ");
                } else {
                    System.out.printf("1 ");
                }
            }
            System.out.println();
        }
        

    }
}
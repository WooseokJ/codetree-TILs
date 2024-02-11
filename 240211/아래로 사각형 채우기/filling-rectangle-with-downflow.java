import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 0; 
        int[][] arr = new int[10][10];
        for(int i = 0; i < n ; i++)
            for(int j = 0 ; j < n; j++)
                arr[j][i] = ++num;
        
        for(int i = 0; i < n;i++){
            for(int j = 0; j < n ;j++){
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }
    }
}
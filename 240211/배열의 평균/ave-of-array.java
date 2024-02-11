import java.util.*;
public class Main {
    static double sumRow = 0;
    static double sumCol = 0;
    static double sumTotal = 0;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[2][4];
        for(int i = 0; i < 2; i ++) {
            for(int j = 0; j < 4; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        
    
        for(int i = 0; i < 2; i++) {    
            for(int j = 0; j < 4; j++) {
                sumRow += arr[i][j];
                sumTotal += arr[i][j];
            }
            System.out.printf("%.1f ", (double) (sumRow / 4));
            sumRow = 0;
        }
        System.out.println();
        for(int i = 0 ; i < 4; i ++) {
            for(int j = 0 ; j < 2 ;j++) {
                sumCol += arr[j][i];
            }
            System.out.printf("%.1f ", (double) (sumCol / 2));
            sumCol = 0 ;
        }

        System.out.println();
        System.out.printf("%.1f ", (double) (sumTotal / 8));

    }
}
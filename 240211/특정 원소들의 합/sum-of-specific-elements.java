import java.util.*;
public class Main {
    static int sum = 0;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[4][4];
        for(int i = 0; i < 4; i ++) {
            for(int j = 0; j < 4; j ++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.printf("%d", arr[0][0] + arr[1][0] + arr[1][1] + arr[2][0] + arr[2][1] + arr[2][2] + arr[3][0] + arr[3][1] + arr[3][2] + arr[3][3]);


    }
}
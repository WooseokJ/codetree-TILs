import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
            Scanner scanner = new Scanner(System.in);

        // 입력 받기
        int n = scanner.nextInt();
        int m = n;
        int[][] grid1 = new int[n][m];
        int[][] grid2 = new int[n][m];

        // 격자 1 입력 받기
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                grid1[i][j] = scanner.nextInt();
            }
        }

        // 격자 2 입력 받기
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                grid2[i][j] = scanner.nextInt();
            }
        }

        int[][] result = new int[n][m];

        // 격자 비교
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid1[i][j] == grid2[i][j]) {
                    result[i][j] = 0;
                } else {
                    result[i][j] = 1;
                }
            }
        }

        // 결과 출력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
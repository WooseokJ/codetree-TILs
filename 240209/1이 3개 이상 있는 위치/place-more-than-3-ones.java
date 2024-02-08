import java.util.*;
public class Main {

    public static int[] dx = new int[]{1,0,-1,0};
    public static int[] dy = new int[]{0,-1,0,1};
    public static int[][] arr = new int[100][100];
    


    public static boolean isRange(int x, int y, int n) {
        return ((0 <= x ) && (x < n) &&
                (0 <= y) && (y < n ));
    }
    public static int result = 0;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0 ; i < n ; i++) {
            for(int j = 0 ; j < n ; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        
        for(int i = 0 ; i < n ; i++) {
            for(int j = 0 ; j < n ; j++) {
                int cnt = 0;
                // 상하좌우 조사.
                for(int dirNum = 0 ; dirNum < 4; dirNum++) {
                    int nx = i + dx[dirNum];
                    int ny = j + dy[dirNum];
                    if(isRange(nx,ny,n) && arr[nx][ny] == 1) {
                        cnt++;
                    }
                }
                if(cnt >= 3) {
                    result++;
                }

            }
        }
        System.out.println(result);
    }
}
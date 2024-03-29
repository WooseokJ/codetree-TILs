import java.util.*;
public class Main {
    public static int nx,ny;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
                            //우,하,좌,상
        int[] dx = new int[]{1,0,-1,0};
        int[] dy = new int[]{0,-1,0,1};
        int x = 0; int y = 0;
        
        for(int i = 0; i < n ; i++) {
            char str = sc.next().charAt(0);
            int dirNum = sc.nextInt();
            int inputNum = directInt(str);
            nx = x + (dx[inputNum] * dirNum);
            ny = y + (dy[inputNum] * dirNum);
            x = nx;
            y = ny;
        }
        System.out.printf("%d %d", nx, ny);
    }
    public static int directInt(char str) {
        switch (str) {
            case 'E' : return 0;
            case 'S' : return 1;
            case 'W' : return 2;
            case 'N' : return 3;
        }
        return -1;
    }

}
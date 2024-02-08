import java.util.*;
public class Main {
    public static int nx,ny;
    public static int x = 0, y = 0, dirNum = 3;;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int[] dx = new int[]{1,0,-1,0};
        int[] dy = new int[]{0,-1,0,1};
        
        for(int i = 0 ; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c == 'L') {
                dirNum = (dirNum - 1 + 4) % 4; // 반시계
            } else if(c == 'R') {
                dirNum = (dirNum + 1) % 4; // 시계
            } else if( c == 'F') {
                nx = x + dx[dirNum];
                ny = y + dy[dirNum];
                x = nx;
                y = ny;
            }
        }

        System.out.printf("%d %d", nx, ny);

    }
}
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = str.charAt(0);
        int n = sc.nextInt();
        if(c == 'A') {
            for(int i = 1 ; i <= n ; i++) {
                System.out.printf("%d ", i);
            }
        } else if (c == 'D') {
            for(int i = n ; i >= 1 ; i --) {
                System.out.printf("%d ", i);
            }
        }
    }
}
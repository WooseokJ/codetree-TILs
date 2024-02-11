import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0 ;
        for(int i = a; i <= b;i++) {
            sum += calc(i);
        }
        System.out.println(sum);
    }
    private static int calc(int n) {
        int cnt= 0;
        for(int i = 1 ; i <= n ; i++) {
            if(n % i == 0) {
                cnt++;
            }
        }
        if(cnt == 2) {
            return n;
        } else {
            return 0;
        }
    }
}
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        int sum = 0 ;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0 ; i<n; i++) {
            int a = sc.nextInt();
            if( a % 2 != 0 || a % 3 == 0) {
                sum+=i;
            }
        }
        System.out.printf("%d", sum);

    }
}
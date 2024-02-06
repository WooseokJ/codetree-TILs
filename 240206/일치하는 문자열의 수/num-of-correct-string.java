import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        int cnt = 0;
        for(int i = 0; i < n; i++) {
            String temp  = sc.next();
            if (temp.compareTo(str) == 0) 
                cnt++;
        }
        System.out.println(cnt);
    }
}
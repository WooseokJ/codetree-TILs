import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt = 0;
        for(int i = a; i <= b;i++) {
            if (isNum(i)) {
                System.out.println(i);
                cnt++;
            }
        }
        System.out.println(cnt);
        
    }
    private static boolean isNum(int n) {
        return contain369(n) || (n % 3 == 0);
    }

    private static boolean contain369(int n) {
        switch (n % 10) {
            case 3: return true;
            case 6: return true;
            case 9: return true;
        }
        return false;
    }

}
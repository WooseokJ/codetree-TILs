import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String str2 = sc.next();
        int c1 = (int) str.charAt(0);
        int c2 = (int) str2.charAt(0);

        System.out.print("%d %d", (c1+c2), (c1>c2 ? c1-c2 : c2-c1));
    }
}
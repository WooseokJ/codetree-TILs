import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = str.charAt(0);
        for(int i = 0 ; i < 8; i ++) {
            System.out.printf("%s",c);
        }
    }
}
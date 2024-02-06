import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int len = str.length();
        for(int i = 0 ; i <= len  ; i ++) {
            System.out.printf("%s\n", str);
            str = str.substring(len - 1, len) + str.substring( 0, len - 1);
        }
    }
}
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int result = 0;
        for(int i = 0 ; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c >= '0' && c <= '9')
                result += c - '0';
        }
        System.out.printf("%d", result);

    }
}
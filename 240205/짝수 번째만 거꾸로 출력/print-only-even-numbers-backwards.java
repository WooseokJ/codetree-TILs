import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String a= sc.next();
        int len = a.length();
        for(int i = len - 1; i >= 0 ; i --) {
            if( i % 2 != 0) {
                System.out.printf("%c",a.charAt(i));
            }
        }
    }
}
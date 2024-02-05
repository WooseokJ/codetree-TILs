import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str= sc.next();
        int n= sc.nextInt();
        int strLen = str.length();
        for(int i = strLen - 1 ; i >= (strLen - n); i--) {
            System.out.printf("%c", str.charAt(i));
        }
    }
}
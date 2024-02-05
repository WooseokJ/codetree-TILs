import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int len = str.length() - 1;
        str = str.substring(0,1) + str.substring(2 , len - 1) + str.substring(len);
        System.out.println(str);
    }
}
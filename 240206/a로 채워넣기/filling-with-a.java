import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str= sc.next();
        String s = str.substring(0,1) + "a" + str.substring(2);
        System.out.println(s);
    }
}
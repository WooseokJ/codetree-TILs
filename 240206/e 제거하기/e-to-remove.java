import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String a= sc.next();
        int idx = a.indexOf("e");
        a = a.substring(0,idx) + a.substring(idx+1);
        System.out.println(a);
    }
}
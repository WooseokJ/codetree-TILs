import java.util.*;

class Code {
    String code;
    String color;
    int second;
    Code(String c1, String c2, int s) {
        code = c1;
        color = c2;
        second = s;
    }

    void print() {
        System.out.printf("code : %s", code);
        System.out.printf("color : %s", color);
        System.out.printf("second : %d", second);
    }
}
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        int val = sc.nextInt();
        Code code = new Code(str1, str2, val);
        code.print();

    }
}
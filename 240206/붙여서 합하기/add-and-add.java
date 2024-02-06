import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str1= sc.next();
        String str2= sc.next();
        int a_b = Integer.parseInt(str1+str2);
        int b_a = Integer.parseInt(str2+str1);
        System.out.printf("%d", a_b + b_a);

    }
}
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(odd(a,b));

    }
    private static int odd(int a, int b) {
        int prod = 1;
        for(int i = 0;  i < b; i++) {
            prod *= a;
        }
        return prod;
    }
}
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        System.out.printf("%d %d", num1(a,b), num2(a,b));

        

    }
    private static int num1(int a, int b) {
        if( a < b) {
            return 1;
        } else {
            return 0;
        }
    }
        private static int num2(int a, int b) {
        if( a == b) {
            return 1;
        } else {
            return 0;
        }
    }
}
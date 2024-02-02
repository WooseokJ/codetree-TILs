import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        String result;
        if(a > c) {
            result = "A";
        } else if (a < c) {
            result = "B";
        } else {
            if( b > d) {
                result = "A";
            } else {
                result = "B";
            }
        }
        System.out.print(result);

    }
}
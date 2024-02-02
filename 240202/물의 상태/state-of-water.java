import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String result;
        if( a< 0) {
            result = "ice"
        } else if(a>=100) {
            result = "vapor"
        } else {
            result = "water"
        }
        System.out.println(result);
    }
}
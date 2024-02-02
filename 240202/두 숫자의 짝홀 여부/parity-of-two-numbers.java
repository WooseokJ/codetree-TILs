import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc =new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        System.out.println(isOdd(a));
        System.out.println(isOdd(b));
    }

    public String isOdd(int n) {
        if( n % 2 == 0 ){
            return "even";
        } else {
            return "odd";
        }

    }
}
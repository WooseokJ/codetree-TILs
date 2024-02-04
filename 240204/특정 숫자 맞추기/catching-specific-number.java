import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int result = 25;
        while(true) {
            int a= sc.nextInt();
            if ( a > result) {
                System.out.println("Lower");
            } else if( a< result) {
                System.out.println("Higher");
            } else {
                System.out.println("Good");
                break;
            }
        }
    }
}
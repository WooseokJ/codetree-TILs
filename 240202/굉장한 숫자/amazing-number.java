import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        boolean result = true;
        if( (a %2 == 0) && (a % 5 == 0) ) {
            System.out.println(result);
        } else if((a % 2 != 0 ) && (a % 3 == 0)) {
            System.out.println(result);
        }else {
            System.out.println(!result);
        }
    }
}
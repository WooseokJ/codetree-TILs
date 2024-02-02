import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        boolean result = true;
        if( year % 4 == 0) {
            System.out.println(result);
        } else if( year % 4 == 0 && ((year % 100 == 0) || (year % 400 == 0) )) {
            System.out.println(result);
        } else {
            System.out.println(!result);
        }
        
    }
}
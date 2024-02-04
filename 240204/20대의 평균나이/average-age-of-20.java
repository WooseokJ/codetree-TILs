import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        double result = 0;
        while(true) {
            double a= sc.nextInt();
            if(a >= 20 && a < 30) {
                cnt ++;
                result+=a;
            } else {
                break;
            }
        }
        System.out.printf("%.2f", (result / cnt) );
        

    }
}
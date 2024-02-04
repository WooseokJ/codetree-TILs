import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        double sum = 0;
        for(int i = 0 ; i < n; i ++ ) {
            double a =  sc.nextDouble();
            sum += a;
        }
        String str;
        if( (sum / n) >= 4) {
                str = "Perfect";
        } else if ((sum / n) >= 3) {
            str = "Good";
        } else {
            str = "Poor";
        }
        System.out.printf("%.1f\n", sum / n);
        System.out.printf("%s", str);
    }
}
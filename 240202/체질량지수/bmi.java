import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();
        a = a / 100;
        double obesity = b / (a * a);
        if( obesity >= 25) {
            System.out.println((int) obesity);
            System.out.println("Obesity");
        }
        
    }
}

// 몸무게 / 키^2(m) = 체질량.
// 178 88 

// cm -> m 
// 1cm = 1 / 100 m
// 178cm = 178 / 100 m
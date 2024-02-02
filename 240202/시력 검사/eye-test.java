import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        double a= sc.nextInt();
        double b= sc.nextInt();
        if ( a > 1 && b > 1) {
            System.out.println("High");
        } else (a > 0.5 && b > 0.5) {
            System.out.println("Middle"); 
        } else{
            System.out.println("Low");
        } 
    }
}
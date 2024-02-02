import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c = sc.nextInt();
        System.out.println(max(a,b,c));

    
    }
    static int max(int a, int b, int c) {
        if( a > b) {
            if( a > c) {
                return a; 
            } else {
                return c;
            }
        } else {
            if( b > c) {
              return b;

            } else {
                return c;
            }
            
        }
    }

    
}
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        
        int min = min(a,b,c);
        if(a == min) {
            System.out.printf("%d",1);
        } else {
            System.out.printf("%d",0);
        }

        System.out.printf(" %d",eqaul(a,b,c));
        
    }

    public static int min(int a, int b, int c) {
        if( a > b) {
            if ( b> c) {
                return c;
            } else {
                return b;
            }
        } else {
            if (a > c){
                return c;
            } else {
                return a;
            }
        }
    }

    public static int eqaul(int a, int b, int c) {
        if (a == b) {
            if (b == c) {
                return 1; 
            }
        } return 0;
    }
}
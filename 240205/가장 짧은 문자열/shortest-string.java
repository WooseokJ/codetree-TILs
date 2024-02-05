import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str1= sc.next();
        String str2= sc.next();
        String str3= sc.next();
        System.out.printf("%d", (max(str1,str2,str3) - min(str1,str2,str3)));
        
    }
    static int max(String str1, String str2, String str3) {
        int a = str1.length();
        int b = str2.length();
        int c = str3.length();
        if(a > b) {
            if( a > c) {
                return a;
            } else {
                return c;
            }
        } else { //a < b 
            if(b > c) {
                return b;
            } else {
                return c;
            }
        }
    }
     static int min(String str1, String str2, String str3) {
        int a = str1.length();
        int b = str2.length();
        int c = str3.length();
        if(a > b) {
            if( b < c) {
                return b;
            } else {
                return c;
            }
        } else { //a < b 
            if(a > c) {
                return c;
            } else {
                return a;
            }
        }
    }
}
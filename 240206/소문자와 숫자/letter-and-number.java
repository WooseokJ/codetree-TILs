import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        // x + 'a' - 'A' // a 
        for(int i = 0 ; i< str.length(); i ++) {
            char c = str.charAt(i);
            if((int)c >= 48 && (int)c <= 57) 
                System.out.printf("%c", c);
            else if(c >= 'A' && c <= 'Z') 
                System.out.printf("%c", c + 'a' - 'A' );
            else if( c>= 'a' && c <= 'z')
                System.out.printf("%c", c );
        }
    }
}
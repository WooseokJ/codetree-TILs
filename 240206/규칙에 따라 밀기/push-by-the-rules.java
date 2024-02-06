import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc= new Scanner(System.in);
        String str = sc.next();
        String input = sc.next();
        for(int i= 0 ; i < input.length(); i ++) {
            char s = input.charAt(i);
            if(s == 'L') {
                str = str.substring(1) + str.substring(0,1);
            } else {
                int len = str.length();
                str = str.substring(len - 1 , len) + str.substring(0,len-1);
            }
        }
        System.out.printf("%s", str);


    }
}
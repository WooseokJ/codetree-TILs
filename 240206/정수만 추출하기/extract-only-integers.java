import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String str2 = sc.next();

        String result = "";
        String result2 = "";

        for(int i = 0 ; i < str.length();i++) {
            char c = str.charAt(i);
            if(c >= '0' && c <= '9') 
                result+=c;
            else
                break;
        }
        for(int i = 0; i < str2.length(); i++) {
            char c = str2.charAt(i);
            if(c >= '0' && c <= '9') 
                result2+=c;
            else
                break;
        }
        System.out.printf("%d", Integer.parseInt(result)+Integer.parseInt(result2));
    }
}
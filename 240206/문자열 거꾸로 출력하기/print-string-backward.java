import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        while(true) {
            String str = sc.next();
            if(str.compareTo("END") == 0 )
                break;
            else
                for(int i = str.length() - 1  ;i >=0 ; i--)
                    System.out.printf("%c", str.charAt(i));
                System.out.println();
        }
    }
}
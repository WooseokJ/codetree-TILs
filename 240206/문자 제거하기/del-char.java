import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str= sc.next();
        while(true) {
            int n = sc.nextInt();
            if(str.length() < n) {
                System.out.println(str);
                break;
            }
            str = str.substring(0,n) + str.substring(n+1);
            System.out.println(str);
        }

    }
}
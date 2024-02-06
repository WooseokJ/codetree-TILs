import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;
        for(int i =0 ;i < n; i++)
            result += sc.nextInt();
        String str = Integer.toString(result);
        str = str.substring(1)+ str.substring(0,1);
        System.out.printf("%s", str);
    }
}
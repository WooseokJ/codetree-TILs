import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String str2 = sc.next();

        str = recycle(str);
        str2 = recycle(str2);

        if (str.equals(str2)) 
            System.out.println("Yes");
         else 
            System.out.println("No");

    }
    public static String recycle(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);

    }
}
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str1= sc.next();
        String str2= sc.next();
        String resultStr;
        if(str1.length() == str2.length()) {
            System.out.printf("same");
        } else {
            resultStr = (str1.length() > str2.length() ? str1 : str2);
            System.out.printf("%s %d", resultStr, resultStr.length());

        }

    }
}
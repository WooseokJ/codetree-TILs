import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        Strint temp;
        
        temp = str1;
        str1 = str2;
        str2 =  temp;

        System.out.pinrtln(str1);
        System.out.pinrtln(str2);
    }
}
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str= sc.next();
        String c = sc.next();
        int num = str.indexOf(c);
        if( num == -1) {
            System.out.println("No");
        } else{ 
            System.out.println(num);
        }
        

    }
}
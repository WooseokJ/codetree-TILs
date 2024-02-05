import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String a= sc.next();
        String b= sc.next();
        String strAll = a+b;
        String strAllReverse = b+a;

        if(strAll.equals(strAllReverse)){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
            
    }
}
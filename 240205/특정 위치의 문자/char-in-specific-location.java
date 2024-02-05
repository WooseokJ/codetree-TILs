import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        char[] arr = new char[]{'L', 'E', 'B', 'R', 'O', 'S'};
        String a = sc.next();
        boolean status = true;
        for(int i = 0 ;i<6;i++) {
            if (arr[i] == a.charAt(0)) {
                System.out.printf("%d",i);
                status = false;
            } 
        }
        if(status) {
            System.out.printf("None");
        }


    }
}
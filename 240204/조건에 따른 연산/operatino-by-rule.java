import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        int a= sc.nextInt();
        while(true) {
            if(a >= 1000) {
                break;
            }
            if (a %2 == 0) {
                a*=3;
                a+=1;
            } else{ 
                a*=2;
                a+=2;
            }
            cnt++;
            
        }
        System.out.print(cnt);
    }
}
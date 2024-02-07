import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        int[] monthArr = new int[]{0,31,30,31,30,31,30,
                                31,31,30,31,30,31};
        int diffday = 0 ;
        while(true) {
            if(m1 == m2 && d1 == d2) {
                break;
            }
            d1++;
            diffday++;
            if(d1 > monthArr[m1]) {
                m1++;
                d1 = 1;
            }
        }        
        System.out.println(diffday);
            
    }
}
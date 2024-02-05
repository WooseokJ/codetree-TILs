import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str= sc.next();
        int eecnt = 0; 
        int ebcnt = 0;
        for(int i = 0 ; i < str.length() - 1; i ++) {
            if(str.substring(i,i+2).equals("ee"))
                eecnt++;
            if(str.substring(i,i+2).equals("eb"))
                ebcnt++;
        }
        System.out.printf("%d %d", eecnt, ebcnt);
    }
}
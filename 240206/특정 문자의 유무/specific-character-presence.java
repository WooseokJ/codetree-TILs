import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str= sc.next();
        String ee = "ee";
        String ab = "ab";
        boolean eeStatus = false;
        boolean abStatus = false;

        for(int i = 0 ; i < str.length() - 1; i++) {
            if(str.substring(i,i+2).equals(ee)) 
                eeStatus = true;
            
            if( str.substring(i,i+2).equals(ab))
                abStatus = true; 
        }
        System.out.printf((eeStatus ? "Yes" : "No") + " " + (abStatus ? "Yes" : "No"));

    }
}
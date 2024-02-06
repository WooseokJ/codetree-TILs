import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String str2 = sc.next();

        int len = str.length();
        int len2 = str2.length();

        int min1 = 0 ;
        int min2 = 0 ;
        for(int i = 0; i < len ; i++){
            str = str.substring(len -1 , len) + str.substring(0,len-1);
            min1++;
            if(str.compareTo(str2) == 0 )
                break ;
        }

        for(int i = 0 ; i< len2; i++){
            str = str.substring(1) + str.substring(0,1);
            min2++;
            if(str.compareTo(str2) == 0 )
                break;
                
        }
        if(min1 == len && min2 == len2)
            System.out.printf("-1");
        else 
            System.out.printf("%d", min1 > min2 ? min2 : min1);
            
    }
}
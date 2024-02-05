import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int cnt = 0 ;
        int result = 0 ;
        for(int i = 0 ; i < 10; i ++) {
            arr[i] = sc.nextInt();
            if( arr[i] % 2 == 0 && arr[i] != 0 ) {
                cnt+=1;
                result+=arr[i];
            }
            
        }
        System.out.printf("%d %d", cnt, result);
        
    }
}
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        String[] arr = new String[201];
        while(true) {
            arr[cnt] = sc.next();
            if(arr[cnt].compareTo("0") == 0){
                System.out.println(cnt);
                break;
            }
            cnt++;
        }
        for(int i = 0 ; i < cnt; i++) 
            if(i % 2 == 0)
                System.out.printf("%s\n", arr[i]);
        
    }
}
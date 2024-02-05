import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];
        int sum = 0 ;
        int k = 0 ;
        for(int i = 0 ; i < 100; i ++) {
            arr[i] = sc.nextInt();
            if(arr[i] == 0) {
                k = i;
                break;
            }
            sum += arr[i];
        }
        System.out.printf("%d", (arr[k-1] + arr[k-2] + arr[k-3]) );

    }
}
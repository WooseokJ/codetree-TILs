import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int n= sc.nextInt();
        arr[0] = 1;
        arr[1] = n;
        System.out.printf("%d %d ", arr[0], arr[1]);

        for(int i = 2 ; i < 100 ; i ++) {
            arr[i] = arr[i - 2] + arr[i-1];
            System.out.printf("%d ", arr[i]);

            if( arr[ i ] >= 100) {
                break;
            }
        }
    }
}
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for(int i = 0 ; i < 10; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] % 2 == 0) {
                arr[i] /= 2;
            } else {
                arr[i] +=3;
            }
            System.out.printf("%d ", arr[i]);
        }
    }
}
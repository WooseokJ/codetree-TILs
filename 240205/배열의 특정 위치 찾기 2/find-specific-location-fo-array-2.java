import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] arr= new int[10];
        int evenSum = 0 ;
        int oddSum = 0 ;
        for(int i = 0 ; i< 10; i++) {
            arr[i] = sc.nextInt();
            if(i % 2 == 0) {
                evenSum += arr[i];
            } else {
                oddSum += arr[i];
            }
        }
        System.out.printf("%d", (evenSum > oddSum) ? (evenSum - oddSum) : (oddSum-evenSum));

    }
}
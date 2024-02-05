import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        final int MIN_VAL = Integer.MIN_VALUE;
        int maxVal = MIN_VAL;

        for(int i = 0 ; i < 10; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        System.out.printf("%d", maxVal);

    }
}
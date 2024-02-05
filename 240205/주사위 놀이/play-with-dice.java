import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int[] countArr = new int[7]; // 0 ... 0 7개(countarr[6]이 마지막.)
        for(int i = 0 ; i < 10; i ++) {
            arr[i] = sc.nextInt();
            countArr[arr[i]] ++; // 1이면 1증가.
        }
        for(int i = 1; i < 7 ; i ++) {
            System.out.printf("%d - %d\n", i, countArr[i]);
        }
    }
}
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        int[] countArr = new int[10]; // 0 ... 0    10개 

        for(int i = 0 ; i < n; i++) { // 0 1 2
            arr[i] = sc.nextInt();
            countArr[arr[i]] += 1;  // 
        }
        for(int i = 1 ; i < 10; i++) { // 0번쨰는 버림.
            System.out.println(countArr[i]);
        }
    }
}
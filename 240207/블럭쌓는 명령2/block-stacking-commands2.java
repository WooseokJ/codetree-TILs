import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i= 0 ; i < k; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr = count(arr, a,b);
        }
        int max = -1;
        for(int i =0 ; i < arr.length;i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
        
    }
    public static int[] count(int[] arr, int i1, int i2) {
        for(int i = i1 - 1 ; i< i2;i++) {
            arr[i]++;
        }
        return arr;
    }
}
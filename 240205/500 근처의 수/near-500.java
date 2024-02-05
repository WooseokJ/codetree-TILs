import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int maxVal = Integer.MIN_VALUE;
        int minVal = Integer.MAX_VALUE;
        int[] arr = new int[10];

        for(int i =0 ; i < 10; i++) {
            arr[i] = sc.nextInt();
            if(arr[i]<500 && arr[i] > maxVal) {
                maxVal = arr[i];
            }
            if (arr[i]>500 && arr[i] < minVal) {
                minVal = arr[i];
            }
         
        }
   
       

        
        System.out.printf("%d %d", maxVal, minVal);
    }
}
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = int[n];
        int[] arr2 = int[n];

        for(int i = 0 ; i < arr1.length;i++)
            arr1[i] = sc.nextInt();
        for(int i = 0 ; i < arr2.length; i++)
            arr2[i] = sc.nextInt();
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1, arr2)) 
            System.out.println("Yes");
        else 
            System.out.println("No");
        

    }
}
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < arr.length;i++)
            arr[i] = sc.nextInt();

        Arrays.sort(arr);
        for(int a : arr)
            System.out.printf("%d ", a);
        System.out.println();
        Integer[] arr2 = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(arr2, Collections.reverseOrder());
        for(int a: arr2)
            System.out.printf("%d ", a);
    }
}
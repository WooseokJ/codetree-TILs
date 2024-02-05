import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] arr = str.toCharArray();
        char temp;
        temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
        System.out.printf("%c%c",arr[0],arr[1]);

        for(int i = 2 ; i < arr.length; i++) {
            if(arr[0] == arr[i]) {
                arr[i] = arr[1];
            } else if( arr[1] == arr[i]) {
                arr[i] = arr[0];
            }
            System.out.printf("%c", arr[i]);
        }
    }
}
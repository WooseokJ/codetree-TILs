import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int gender = sc.nextInt();
        int age = sc.nextInt();
        String result;
        if(gender == 0 && (age >= 19)) {
            result = "MAN";
        } else if( gender == 0 && (age < 19)) {
            result = "BOY";
        } else if(gender == 1 && (age >= 19)) {
            result = "WOMAN";
        } else {
            result = "GIRL";
        }
        System.out.println(result);
    }
}
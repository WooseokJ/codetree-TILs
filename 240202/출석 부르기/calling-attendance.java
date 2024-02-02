import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String result;
        switch (a) {
            case 1:
            result = "John";
            break;
            case 2: 
                result = "Tom";
                break;
            case 3: 
                result = "Paul";
                break;
            default:
                result = "Vacancy";
        }
        System.out.println(result);
    }
}
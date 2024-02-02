import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char c = str.charAt(0);
        String result;
        switch (c) {
            case 'S' : 
            result = "Superior";
            break;
            case 'A':
            result = "Excellent";
            break;
            case 'B':
            result = "Good";
            break;
            case 'C':
            result = "Usually";
            break;
            case 'D':
            result = "Effort";
            break;
            default:
            result = "Failure";
        }
        System.out.println(result);
        

    }
}
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        Strint result;
        if(a >= 3 && a <= 5) {
            result = "Spring";
        } else if(a >= 6 && a <= 8) {
            result = "Summer";
        } else if(a >= 9 && a <= 11) {
            result = "Fall";
        } else {
            result = "Winter";
        }
        System.out.println(result);
    }
}
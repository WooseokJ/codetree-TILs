import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(select(n));

    }
    private static String select(int n ){
        int m = n / 10;
        int s = n % 10;
        int sel = m + s; 
        if((n % 2 == 0) && (sel % 5 == 0)) {
            return "Yes";
        } else {return "No";}
    }
}
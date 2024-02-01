import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("-");
        int start = sc.nextInt();
        int center = sc.nextInt();
        int end =sc.nextInt();
        System.out.printf("0%d-%d-%d",start,end,center);
    }
}
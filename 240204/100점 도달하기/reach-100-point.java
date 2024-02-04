import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String str;
        for(int i = a; i <= 100; i ++) {
            if(i >= 90) {
                str = "A";
            } else if(i >= 80) {
                str = "B";
            }else if(i >= 70) {
                str = "C";
            }else if(i >= 60) {
                str = "D";
            } else {
                str = "F";
            }
            System.out.printf("%s ", str);
        }
    }
}
import java.util.*;
class Code {
    String secretCode;
    String meetingPoint;
    int time;

    Code(String s, String m , int t) {
        secretCode = s;
        meetingPoint = m;
        time = t;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String secretCode = sc.next();
        String meetingPoint = sc.next();
        
        int time = sc.nextInt();
        Code code = new Code(secretCode, meetingPoint, time);

        System.out.printf("secret code : %s\n", code.secretCode);
        System.out.printf("meeting point : %s\n", code.meetingPoint);
        System.out.printf("time : %d", code.time);
    }
}
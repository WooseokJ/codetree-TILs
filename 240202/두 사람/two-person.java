import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int age= sc.nextInt();
        String str= sc.next();
        int age2= sc.nextInt();
        String str2= sc.next();

        char gender1 = str.charAt(0);
        char gender2 = str2.charAt(0);

        if(gender1 == 'M' && (age >= 19)) {
            System.out.println(1);
        } else if(gender2 == 'M' && (age2 >= 19)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }


        
    }
}
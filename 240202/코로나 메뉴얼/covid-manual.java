import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str1= sc.next();
        char p1_a = str1.charAt(0);
        int p1_b= sc.nextInt();
        
        
        String str2= sc.next();
        char p2_a = str2.charAt(0);
        int p2_b= sc.nextInt();
        

        String str3= sc.next();
        char p3_a = str3.charAt(0);
        int p3_b= sc.nextInt();

        int count = 0 ;
        if(p1_a == 'Y' && p1_b >= 37) {
            count +=1;
        } 
        if (p2_a == 'Y' && p2_b >= 37) {
            count +=1;
        }
        if (p3_a == 'Y' && p3_b >= 37) {
            count +=1;
        }
        System.out.println(count >= 2 ? "E" : "N");
    }
}
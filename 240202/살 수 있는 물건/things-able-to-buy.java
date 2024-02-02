import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int book = 3000;
        int mask = 1000;
        int a = sc.nextInt();
        if(a >= book) {
            System.out.println("book");
        } else if(a >= mask){
            System.out.println("mask");
        }  else {
            System.out.println("no");
        }
    }
}
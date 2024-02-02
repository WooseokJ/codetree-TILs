import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int book = 3000;
        int mask = 1000;
        int pen = 500;
        String result;
        if(a >= book) {
            result = "book"; 
        }  else if(a >= mask) {
            result = "mask";
        } else if(a >= pen) {
            result = "pen";
        } else{
            result = "no";
        } 
        System.out.println(result);
    }
}
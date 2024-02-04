import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str;
        while(true) {
            int a= sc.nextInt();
            switch (a) {
                case 1: str = "John";
                case 2: str = "Tom";
                case 3: str =  "Paul";
                case 4: str =  "Dam";
                default: str = "Vacancy";break;
            }
            System.out.println(str);
        }
    }

}
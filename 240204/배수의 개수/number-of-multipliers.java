import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int cntThree = 0;
        int cntFive = 0;
        for(int i = 0 ; i < 10; i++) {
            int a = sc.nextInt();
            if(a % 3 == 0 ) {
                cntThree+=1;
            } if(a % 5 == 0) {
                cntFive+=1;
            }
        }
        System.out.printf("%d %d", cntThree, cntFive);
        
    }
}
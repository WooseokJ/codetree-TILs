import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int inputHour = sc.nextInt();
        int inputMin = sc.nextInt();
        int outputHour = sc.nextInt();
        int outputMin = sc.nextInt();

        int diffTime = 0;

        while(true){
            if(inputHour == outputHour && inputMin == outputMin ) {
                break;
            }
            diffTime++;
            inputMin++;
            if(inputMin == 60) {
                inputHour++;
                inputMin = 0;
            }
        }
        System.out.println(diffTime);
    }
}
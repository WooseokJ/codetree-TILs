import java.util.*;

class User {
    String name;
    int score;
    User(String n, int s) {
        name = n;
        score = s;
    }
}
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        User[] users = new User[5];
        for(int i = 0 ; i < 5; i ++) {
            String name = sc.next();
            int score = sc.nextInt();
            users[i] = new User(name,score);
        }
        int min = Integer.MAX_VALUE;
        for(User user : users) {
            if (user.score < min) {
                min = user.score;
            }
        }
        
        for(User user : users) {
            if(min == user.score) {
                System.out.printf("%s %d", user.name, user.score);
            }
        }

    
    }
}
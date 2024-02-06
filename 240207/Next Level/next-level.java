import java.util.*;
class User {
    String id;
    int level;
    User(String id, int level) {
        this.id = id;
        this.level = level;
    }
    void printUser() {
        System.out.printf("user %s lv %d", id, level);
    }
}


public class Main {
    public static void main(String[] args) {

        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        int level = sc.nextInt();
        User user1 = new User(id,level);
        System.out.println("user codetree lv 10");
        user1.printUser();


    }
}
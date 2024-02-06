import java.util.*;
class User {
    String name;
    int height;
    int kg;
    User(String n, int h, int k) {
        name = n;
        height = h;
        kg = k;
    }
    void print() {
        System.out.printf("%s %d %d\n", name, height, kg);
    }

} 
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        User[] users = new User[n];
        for(int i = 0; i < n ; i++) {
            String name = sc.next();
            int height = sc.nextInt();
            int kg = sc.nextInt();
            users[i] = new User(name, height, kg);
        }

        Arrays.sort(users, new Comparator<User>() {
            @Override
            public int compare(User a, User b) {
                if(a.height == b.height) {
                    return b.kg - a.kg;
                }
                return a.height - b.height;
            }
        });

        for(User user: users) {
            user.print();
        }
    }
}
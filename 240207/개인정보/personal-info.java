import java.util.*;
class User {
    String name;
    int height; 
    double kg;
    User(String n, int h, double k) {
        name = n;
        height = h;
        kg = k;
    }
    void print() {
        System.out.printf("%s %d %.1f\n", name, height, kg);
    }

    


}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        User[] users = new User[5];
        for(int i= 0 ; i < 5; i++) {
            String name = sc.next();
            int height = sc.nextInt();
            double kg = sc.nextDouble();
            users[i] = new User(name, height, kg);
        }

        Arrays.sort(users, new Comparator<User>() {
            @Override
            public int compare(User a, User b) {
                return a.name.compareTo(b.name);
            }
        });
        
        System.out.println("name");
        for(User user : users)
            user.print();

        Arrays.sort(users, new Comparator<User>(){
            @Override
            public int compare(User a, User b) {
                return b.height - a.height;
            }
        });
        System.out.println();
        System.out.println("height");

        for(User user : users)
            user.print();
    }
}
import java.util.*;

class User {
    int kg;
    int height;
    int rank;
    User(int k , int h, int r) {
        kg = k;
        height = h;
        rank = r;
    }
    void print() {
        System.out.printf("%d %d %d\n",height, kg , rank);
    }
}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        User[] users = new User[n];
        for(int i = 0; i < n; i++) {
            int height = sc.nextInt();
            int kg = sc.nextInt();
            users[i] = new User(kg, height, i+1);
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

        for(User u: users)
            u.print();

    }
}
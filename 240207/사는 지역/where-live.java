import java.util.*;

class User {
    String name;
    String addr;
    String city;
    User(String n, String a, String c) {
        name = n;
        addr = a;
        city = c;
    }
    void print() {
        System.out.printf("name %s\n",name);
        System.out.printf("addr %s\n",addr);
        System.out.printf("city %s\n",city);
    }
}
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        User[] users = new User[n];
        for(int i = 0; i < n;i++){
            String name = sc.next();
            String addr = sc.next();
            String city = sc.next();
            users[i] = new User(name, addr, city);
        }
        String[] arr = new String[n];
        for(int i = 0; i < n; i++) {
            arr[i] = users[i].name;
        }
        Arrays.sort(arr, Collections.reverseOrder());

        for(User user: users) {
            if(arr[0] == user.name) {
                user.print();
            }
        }

        
    }
}
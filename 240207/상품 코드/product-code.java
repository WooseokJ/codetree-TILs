import java.util.*;
class Product {
    String name;
    int code;
    product(String n, int c) {
        name = n;
        code = c;
    }
    void print() {
        System.out.println("product 50 is codetree");
        System.out.println("product %d is %s", code, name);
    }
}
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int code = sc.nextInt();
        Product product = new Product(name, code);
        product.print();
    }
}
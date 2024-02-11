import java.util.*;
class Integer {
    int value; 
    Integer(int value) {
        this.value = value;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Integer a = new Integer(n);
        Integer b = new Integer(m);
        swap(a,b);
        System.out.printf("%d %d",a.value, b.value);
    }
    public static void swap(Integer a, Integer b) {

        int temp = a.value;
        a.value = b.value;
        b.value = temp;

    }
 
}
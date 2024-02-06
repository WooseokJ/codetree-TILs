import java.util.*;

class Student implements Comparable<Student> {
    int height;
    int kg;
    int rank;

    Student(int h, int k, int r) {
        height = h;
        kg = k;
        rank = r;
    }
    @Override
    public int compareTo(Student student) {
        if(this.height == student.height) {
            if(this.kg == student.kg) {
                return student.rank - this.rank;
            }
            return this.kg - student.kg;
        } 
        return this.height - student.height;
    }

    void print() {
        System.out.printf("%d %d %d\n", height, kg, rank);
    }

}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] students = new Student[n];
        for(int i = 0 ; i< n; i++) {
            int height = sc.nextInt();
            int kg = sc.nextInt();
            students[i] = new Student(height, kg, i + 1);
        }
        Arrays.sort(students);
        for(int i = n -1 ; i >= 0 ; i--)
            students[i].print();


    }
}
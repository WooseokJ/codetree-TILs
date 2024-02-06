import java.util.*;

class Student implements Comparable<Student> {
    String name;
    int kor, eng, math;

    public Student(String name, int kor, int eng, int math){
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    @Override
    public int compareTo(Student student) {  // 총 점수 기준 오름차순 정렬
        return (this.kor + this.eng + this.math) - (student.kor + student.eng + student.math);
    }
    void print() {
        System.out.printf("%s %d %d %d\n", name, kor, eng, math);
    }
};

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] students = new Student[n];
        for(int i = 0; i < n; i++) {
            String name = sc.next();
            int kor = sc.nextInt();
            int eng = sc.nextInt();
            int math = sc.nextInt();
            students[i] = new Student(name, kor, eng, math);
        }


        Arrays.sort(students); // 총 점수 기준 오름차순 정렬

        for(Student s: students)
            s.print();
    }
}
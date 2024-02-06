import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

// 학생들의 정보를 나타내는 클래스 선언
class Student implements Comparable<Student> {
    String name;
    int kor, egn, math;
    Student(String n, int k, int e, int m) {
        name = n;
        kor = k;
        egn = e;
        math = m;
    }

    @Override
    public int compareTo(Student student) {
        if( this.kor == student.kor) {
            if(this.egn == student.egn) {
                return this.math - student.math;
            }
            return this.egn - student.egn;
        }
        return this.kor - student.kor;
    }

    void print() {
        System.out.printf("%s %d %d %d\n",name,kor,egn,math);
    }

    

};

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] students = new Student[n];
        for(int i = 0; i < n;i++) {
            String name = sc.next();
            int kor = sc.nextInt();
            int egn = sc.nextInt();
            int math = sc.nextInt();
            students[i] = new Student(name, kor,egn, math);
        }
        Arrays.sort(students);
        for(int i = n -1 ; i >=0 ; i--) 
            students[i].print();




    }
}
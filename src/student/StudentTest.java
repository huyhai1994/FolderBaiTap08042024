package student;

import java.lang.reflect.Array;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("Hai",30,10);
        student1.putStudentScore(9);
        student1.putStudentScore(8);
        student1.putStudentScore(10);
        student1.putStudentScore(7);
        System.out.println("Average Score of student : " + student1.getAverageScore());

    }
}

package test.java;
import main.java.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentTest {

    public static void main(String args[]){
        List<Student> al = new ArrayList<>();
        al.add(new Student(101, "pratheek", 30, 1200));
        al.add(new Student(103, "virinch", 28, 3200));
        al.add(new Student(105, "pooja", 24, 1600));
        al.add(new Student(104, "sai", 23, 1700));

        Student.sortAndPrint(al, 29, (s1, s2) -> {
            return s1.getAge() - s2.getAge();
        });
        al.add(new Student(105, "sushma", 25, 1300));
        System.out.println("Elements after adding sushma");
        Student.sortAndPrint(al, 29, (s1, s2) -> {
            return s1.getAge() - s2.getAge();
        });

    }

}

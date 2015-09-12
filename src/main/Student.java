package main;

import java.util.Comparator;
import java.util.List;

public class Student {
    private int rollno;
    private String name;
    private int age;
    private int totalMarks;

    public Student(int rollno, String name, int age, int totalMarks) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
        this.totalMarks = totalMarks;
    }

    public static void sortAndPrint(List<Student> al, int age, Comparator<Student> c) {
        al.stream()
                .sorted(c)
                .forEach((a) -> {
                    if (a.getAge() < age)
                        System.out.println(a.getName() + "\t" + a.getAge() + "\t" + a.getRollno() + "\t" + a.getTotalMarks());
                });
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(int totalMarks) {
        this.totalMarks = totalMarks;
    }
}

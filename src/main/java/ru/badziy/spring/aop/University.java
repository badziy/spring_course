package ru.badziy.spring.aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudents() {
        Student st1 = new Student("Alan Badziev", 5, 7.1);
        Student st2 = new Student("Fatima Badzieva", 4, 9.5);
        Student st3 = new Student("Arsen Badziev", 4, 7.2);

        students.add(st1);
        students.add(st2);
        students.add(st3);
    }

    public List<Student> getStudents() {
        System.out.println("Начало работы метода getStudents");
       // System.out.println(students.get(3));
        System.out.println("Information from method getStudents:");
        System.out.println(students);
        return students;
    }
}

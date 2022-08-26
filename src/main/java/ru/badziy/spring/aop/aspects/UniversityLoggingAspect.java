package ru.badziy.spring.aop.aspects;


import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import ru.badziy.spring.aop.Student;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {
    /*
    @Before("execution(* getStudents())")
    public void beforeGetStudentsLoggingAdvice() {
        System.out.println("beforeGetStudentsLoggingAdvice: логгируем получение " + "списка студентов перед методом getStudents");
    }

     */
/*
    @AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
    public void afterReturningGetStudentsLoggingAdvice(List<Student> students) {

        Student firstStudent = students.get(0);

        String nameSurname = firstStudent.getNameSurname();
        nameSurname = "Mr. " + nameSurname;
        firstStudent.setNameSurname(nameSurname);

        double avgGrade = firstStudent.getAvgGrade();
        avgGrade = avgGrade + 1;
        firstStudent.setAvgGrade(avgGrade);


        System.out.println("afterReturningGetStudentsLoggingAdvice: логгируем получение " + "списка студентов после работы метода getStudents");
    }

 */
  /*
    @AfterThrowing(pointcut = "execution(* getStudents())", throwing = "exception")
    public void afterThrowningGetStudentsLoggingAdvice(Throwable exception) {
        System.out.println("afterThrowningGetStudentsLoggingAdvice: логгируем выброс " + "исключения " + exception);
    }

   */

    @After("execution(* getStudents())")
    public void afterGetStudentsLoggingAdvice() {
        System.out.println("afterGetStudentsLoggingAdvice: логгируем нормальное" + " выполнение метода метода или выброс исключения");
    }
}

package ru.badziy.spring.aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import ru.badziy.spring.aop.Book;

@Component
@Aspect
@Order(1)
public class LoggingAspect {
/*
    @Pointcut("execution(* ru.badziy.spring.aop.UniLibrary.*(..))")
    private void allMethodsFromUniLibrary(){}

    @Pointcut("execution(* ru.badziy.spring.aop.UniLibrary.returnMagazine())")
    private void returnMagazineFromUniLibrary(){}

    @Pointcut("allMethodsFromUniLibrary() && !returnMagazineFromUniLibrary()")
    private void allMethodsFromUniLibraryExceptReturnMagazine(){}

    @Before("allMethodsFromUniLibraryExceptReturnMagazine()")
    public void beforeAllMethodsFromUniLibraryExceptReturnMagazineAdvice() {
        System.out.println("beforeAllMethodsFromUniLibraryExceptReturnMagazineAdvice: log #10");
    }

 */


    /*
    @Pointcut("execution(* ru.badziy.spring.aop.UniLibrary.get*())")
    private void allGetMethodsFromUniLibrary(){}

    @Pointcut("execution(* ru.badziy.spring.aop.UniLibrary.return*())")
    private void allReturnMethodsFromUniLibrary(){}

    @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary()")
    private void allGetAndReturnMethodsFromUniLibrary(){}

    @Before("allGetMethodsFromUniLibrary()")
    public void beforeGetLoggingAdvice() {
        System.out.println("beforeGetLoggingAdvice: writing log #1");
    }

    @Before("allReturnMethodsFromUniLibrary()")
    public void beforenReturnLoggingAdvice() {
        System.out.println("beforeReturnLoggingAdvice: writing log #2");
    }

    @Before("allGetAndReturnMethodsFromUniLibrary()")
    public void beforeGetAndReturnLoggingAdvice() {
        System.out.println("beforeGetAndReturnLoggingAdvice: writing log #3");
    }

 */



    @Before("ru.badziy.spring.aop.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature= " + methodSignature);
        System.out.println("methodSignature.getMethod()= " + methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType()= " + methodSignature.getReturnType());
        System.out.println("methodSignature.getName()= " + methodSignature.getName());
        if (methodSignature.getName().equals("addBook")) {
            Object[] arguments = joinPoint.getArgs();
            for (Object obj: arguments) {
                if (obj instanceof Book) {
                    Book myBook = (Book) obj;
                    System.out.println("Информация о книге: название - " + myBook.getName() +
                            ", автор - " + myBook.getAuthor() + ", год публикации - " + myBook.getYearOfPublication());
                }
                else if (obj instanceof String) {
                    System.out.println("Книгу в библиотеку добавляет " + obj);
                }
            }
        }
        System.out.println("beforeGetLoggingAdvice: логгирование " + "попытки взять книгу/журнал");
        System.out.println("-----------------------------------------------------");
    }



}

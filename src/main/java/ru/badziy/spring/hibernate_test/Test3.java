package ru.badziy.spring.hibernate_test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.badziy.spring.hibernate_test.entity.Employee;

import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class).buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

         //   List<Employee> emps = session.createQuery("from Employee").getResultList();

            List<Employee> emps = session.createQuery("from Employee " + "where firstName = 'Fatima' AND salary > 900").getResultList();


            for (Employee e:
                 emps) {
                System.out.println(e);
            }

            session.getTransaction().commit();


            System.out.println("Done!");
        }
        finally {
            factory.close();
        }


    }
}

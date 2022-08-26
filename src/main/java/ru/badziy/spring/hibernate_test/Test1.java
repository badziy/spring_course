package ru.badziy.spring.hibernate_test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.badziy.spring.hibernate_test.entity.Employee;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class).buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            Employee emp = new Employee("Fatima", "Badzieva", "IT", 600);
            session.beginTransaction();
            session.save(emp);
            session.getTransaction().commit();
            System.out.println("Done!");
            System.out.println(emp);
        }
        finally {
            factory.close();
        }


    }
}

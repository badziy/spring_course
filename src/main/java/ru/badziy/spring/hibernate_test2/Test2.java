package ru.badziy.spring.hibernate_test2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.badziy.spring.hibernate_test2.entity.Detail;
import ru.badziy.spring.hibernate_test2.entity.Employee;

public class Test2 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class).addAnnotatedClass(Detail.class).buildSessionFactory();

        Session session = null;

        try {
/*
            session = factory.getCurrentSession();
            Employee employee = new Employee("Arsen", "Badziev", "HR", 850);
            Detail detail = new Detail("Volnyi-Aul", "543219876", "arsen@yandex.ru");

            employee.setEmpDetail(detail);
            detail.setEmployee(employee);

            session.beginTransaction();

            session.save(detail);


            session.getTransaction().commit();
            System.out.println("Done!");

 */
/*
            session = factory.getCurrentSession();


            session.beginTransaction();

            Detail detail = session.get(Detail.class, 4);
            System.out.println(detail.getEmployee());


            session.getTransaction().commit();
            System.out.println("Done!");

 */

            session = factory.getCurrentSession();
            session.beginTransaction();

            Detail detail = session.get(Detail.class, 1);
            detail.getEmployee().setEmpDetail(null);
            session.delete(detail);


            session.getTransaction().commit();
            System.out.println("Done!");

        }
        finally {
            session.close();
            factory.close();
        }


    }
}

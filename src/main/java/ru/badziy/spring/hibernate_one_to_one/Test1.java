package ru.badziy.spring.hibernate_one_to_one;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.badziy.spring.hibernate_one_to_one.entity.Detail;
import ru.badziy.spring.hibernate_one_to_one.entity.Employee;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class).addAnnotatedClass(Detail.class).buildSessionFactory();

        Session session = null;

        try {
            /*
            Session session = factory.getCurrentSession();
            Employee employee = new Employee("Alan", "Badziev", "IT", 500);
            Detail detail = new Detail("Nalchik", "123456789", "badjity@yandex.ru");
            employee.setEmpDetail(detail);

            session.beginTransaction();

            session.save(employee);


            session.getTransaction().commit();
            System.out.println("Done!");

             */

            /*
            Session session = factory.getCurrentSession();
            Employee employee = new Employee("Soslan", "Badziev", "Sales", 700);
            Detail detail = new Detail("Moscow", "987654321", "soso@yandex.ru");
            employee.setEmpDetail(detail);

            session.beginTransaction();

            session.save(employee);


            session.getTransaction().commit();
            System.out.println("Done!");

             */

            /*
            session = factory.getCurrentSession();
            session.beginTransaction();

            Employee emp = session.get(Employee.class, 10);
            System.out.println(emp.getEmpDetail());


            session.getTransaction().commit();
            System.out.println("Done!");

             */

            session = factory.getCurrentSession();
            session.beginTransaction();

            Employee emp = session.get(Employee.class, 2);
            session.delete(emp);


            session.getTransaction().commit();
            System.out.println("Done!");
        }
        finally {
            session.close();
            factory.close();
        }


    }
}

package ru.badziy.spring.hibernate_many_to_many;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import ru.badziy.spring.hibernate_many_to_many.entity.Child;
import ru.badziy.spring.hibernate_many_to_many.entity.Section;


public class Test {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class).buildSessionFactory();

        Session session = null;

        try {
            /*
            session = factory.getCurrentSession();

            Section section1 = new Section("Football");
            Child child1 = new Child("Alan", 5);
            Child child2 = new Child("Soslan", 7);
            Child child3 = new Child("Fatima", 6);

            section1.addChildToSection(child1);
            section1.addChildToSection(child2);
            section1.addChildToSection(child3);

            session.beginTransaction();

            session.save(section1);

            session.getTransaction().commit();

            System.out.println("Done!!!");

             */

            /*
            session = factory.getCurrentSession();

            Section section1 = new Section("VolleyBall");
            Section section2 = new Section("Chess");
            Section section3 = new Section("Math");
            Child child1 = new Child("Arsen", 10);

            child1.addSectionToChild(section1);
            child1.addSectionToChild(section2);
            child1.addSectionToChild(section3);

            session.beginTransaction();

            session.save(child1);

            session.getTransaction().commit();

            System.out.println("Done!!!");

             */
/*
            session = factory.getCurrentSession();



            session.beginTransaction();

            Section section = session.get(Section.class, 1);
            System.out.println(section);
            System.out.println(section.getChildren());

            session.getTransaction().commit();

            System.out.println("Done!!!");

 */
            /*
            session = factory.getCurrentSession();



            session.beginTransaction();

            Child child = session.get(Child.class, 4);
            System.out.println(child);
            System.out.println(child.getSections());

            session.getTransaction().commit();

            System.out.println("Done!!!");

             */

            /*
            session = factory.getCurrentSession();



            session.beginTransaction();

            Section section = session.get(Section.class, 1);
            session.delete(section);

            session.getTransaction().commit();

            System.out.println("Done!!!");

             */
/*
            session = factory.getCurrentSession();

            Section section1 = new Section("Dance");
            Child child1 = new Child("Ira", 12);
            Child child2 = new Child("Marina", 8);
            Child child3 = new Child("Zina", 9);
            section1.addChildToSection(child1);
            section1.addChildToSection(child2);
            section1.addChildToSection(child3);


            session.beginTransaction();

            session.persist(section1);



            session.getTransaction().commit();

            System.out.println("Done!!!");

 */
            /*
            session = factory.getCurrentSession();




            session.beginTransaction();

            Section section = session.get(Section.class, 7);

            session.delete(section);

            session.getTransaction().commit();

            System.out.println("Done!!!");

             */
            session = factory.getCurrentSession();




            session.beginTransaction();

            Child child = session.get(Child.class, 5);

            session.delete(child);

            session.getTransaction().commit();

            System.out.println("Done!!!");
        }
        finally {

            session.close();
            factory.close();

        }
    }
}

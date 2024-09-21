package main;

import beans.Rank;
import beans.Student;
import hibernateutils.HibernateUtility;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {

    public static void main(String[] args) {
        Session session = HibernateUtility.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        System.out.println(session);

        try {

            Student student = new Student();
            student.setName("Saket");
            student.setRoll(12);
            student.setRank(new Rank(3));

            session.persist(student);
            transaction.commit();


        } catch (HibernateException e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }


}

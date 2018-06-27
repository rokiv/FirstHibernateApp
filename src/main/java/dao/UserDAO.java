package dao;

import models.Auto;
import models.User;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateSessionFactoryUtil;

import java.util.List;


public class UserDAO {

    public User findById(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(User.class,id);
    }

    public void save(User user) {
        Session  session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction ts1 = session.beginTransaction();
        session.save(user);
        ts1.commit();
        session.close();
    }

    public void update(User user) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction ts = session.beginTransaction();
        session.update(user);
        ts.commit();
        session.close();
    }

    public void delete(User user) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction ts = session.beginTransaction();
        session.delete(user);
        ts.commit();
        session.close();
    }

    public Auto findAutoByUser(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Auto.class,id);
    }

    public List<User> findAll() {
        List<User> users = (List<User>) HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("From models.User").list();
        return users;
    }



}

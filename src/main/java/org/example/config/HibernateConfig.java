package org.example.config;

import org.example.entity.Comment;
import org.example.entity.Post;
import org.example.entity.User;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateConfig {

    public static SessionFactory getSessionFactory() {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(User.class)
                .addAnnotatedClass(Post.class)
                .addAnnotatedClass(Comment.class)
                .buildSessionFactory();
        return sessionFactory;
    }
}

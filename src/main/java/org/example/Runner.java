package org.example;

import org.example.config.HibernateConfig;
import org.example.dao.InstagramDao;
import org.example.entity.Comment;
import org.example.entity.Post;
import org.example.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Runner {

    public static void main(String[] args) {
        try (SessionFactory sessionFactory = HibernateConfig.getSessionFactory();
             Session session = sessionFactory.openSession()) {
            InstagramDao instagramDao = new InstagramDao();
            User user = new User("Anton", "qwe123");
            instagramDao.saveUser(session, user);
            Post post = new Post("Hello", user);
            instagramDao.savePost(session, post);
            Comment comment = new Comment("Lol", user);
            instagramDao.saveComment(session, comment);
        }
    }
}

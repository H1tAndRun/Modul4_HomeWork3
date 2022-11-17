package org.example.dao;

import org.example.entity.Comment;
import org.example.entity.Post;
import org.example.entity.User;
import org.hibernate.Session;

public class InstagramDao {

    public void saveUser(Session session, User user) {
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
    }

    public void savePost(Session session, Post post) {
        session.beginTransaction();
        session.save(post);
        session.getTransaction().commit();
    }

    public void saveComment(Session session, Comment comment) {
        session.beginTransaction();
        session.save(comment);
        session.getTransaction().commit();
    }
}

package org.example.entity;

import lombok.Data;
import lombok.NonNull;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.GenerationType;
import javax.persistence.Version;
import javax.persistence.OneToMany;
import java.util.Calendar;
import java.util.List;

@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NonNull
    @Column(unique = true, nullable = false)
    private String name;

    @NonNull
    @Column(nullable = false)
    private String password;

    @Version
    @Column(name = "created_at ")
    private Calendar calendar;

    @OneToMany(mappedBy = "user")
    private List<Post> postList;

    @OneToMany(mappedBy = "userComment")
    private List<Comment> listComment;
}

package org.example.entity;

import lombok.Data;
import lombok.NonNull;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import javax.persistence.Version;
import java.util.Calendar;

@Entity
@Table(name = "comment")
@Data
public class Comment {

    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NonNull
    @Column
    private String text;

    @Column
    @Version
    private Calendar calendar;

    @NonNull
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User userComment;
}

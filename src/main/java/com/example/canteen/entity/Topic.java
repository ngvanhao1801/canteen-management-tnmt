package com.example.canteen.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name ="topic")
public class Topic implements Serializable {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="title",nullable = false)
    private String title;

    @Column(name = "creation_date",nullable = false)
    private String CreationDate;

    @Column(name ="body",nullable = false, length = 1024)
    private String body;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

    public Topic(String title, String creationDate, String body,User user) {
        this.title = title;
        CreationDate = creationDate;
        this.body = body;
        this.user=user;
    }
}

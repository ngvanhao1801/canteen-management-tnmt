package com.example.canteen.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Comment implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @Column(name = "body", nullable = false, length = 1024)
  private String Body;

  @Column(name = "creation_date", nullable = false)
  private String CreationDate;

  @ManyToOne
  @JoinColumn(name = "user_id")
  private User user;

  @ManyToOne
  @JoinColumn(name = "topic_id")
  private Topic topic;

  public Comment(String body, String creationDate, User user, Topic topic) {
    Body = body;
    CreationDate = creationDate;
    this.user = user;
    this.topic = topic;
  }
}

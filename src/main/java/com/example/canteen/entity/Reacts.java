package com.example.canteen.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Reacts implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Column(name = "name")
  private String Name;

  @ManyToOne
  @JoinColumn(name = "user_id", nullable = false)
  private User user;

  @ManyToOne
  @JoinColumn(name = "topic_id", nullable = true)
  private Topic topic;

  @ManyToOne
  @JoinColumn(name = "comment_id", nullable = true)
  private Comment comment;

  public Reacts(String name, User user, Topic topic, Comment comment) {
    Name = name;
    this.user = user;
    this.topic = topic;
    this.comment = comment;
  }


}

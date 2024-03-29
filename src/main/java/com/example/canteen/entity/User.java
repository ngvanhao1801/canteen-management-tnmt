package com.example.canteen.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "dbo_users")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
  //Tài khoản đăng nhập kết nối với database
  @Id
  @Column(name = "id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int ID;

  @Column(name = "email", nullable = false)
  private String email;

  @Column(name = "user_display_name", nullable = false)
  private String UserDisplayName;

  @Column(name = "about_me", nullable = true)
  private String AboutMe;

  @Column(name = "views", nullable = false)
  private int Views;

  @Column(name = "topic_counts", nullable = false)
  private int TopicCounts;

  @Column(name = "password", nullable = false)
  private String Password;

  @Column(name = "creation_date", nullable = false)
  private String CreationDate;

  @Column(name = "role", nullable = false)
  private String Role;


  public User(String Email, String userDisplayName, String aboutMe, int views, int topicCounts, String password, String creationDate, String role) {
    email = Email;
    UserDisplayName = userDisplayName;
    AboutMe = aboutMe;
    Views = views;
    TopicCounts = topicCounts;
    Password = password;
    CreationDate = creationDate;
    Role = role;
  }
}

package com.example.canteen.entity.relationship;

import com.example.canteen.entity.Tags;
import com.example.canteen.entity.Topic;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "topic_and_tags")
public class TopicAndTags implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @ManyToOne
  @JoinColumn(name = "topic_id")
  private Topic topic;

  @ManyToOne
  @JoinColumn(name = "tag_id")
  private Tags tags;
}

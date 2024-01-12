package com.example.canteen.service;

import com.example.canteen.dto.TopicDto;
import com.example.canteen.entity.Topic;
import com.example.canteen.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface TopicService {
    void save(TopicDto topicDto, User user);
    Topic findTopicById(Integer id);
    void delete(Integer id);
    void update(Topic topic);
}

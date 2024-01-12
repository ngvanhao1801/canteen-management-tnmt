package com.example.canteen.service;

import com.example.canteen.dto.CommentDto;
import com.example.canteen.entity.Comment;
import com.example.canteen.entity.Topic;
import com.example.canteen.entity.User;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public interface CommentService {
    void save(CommentDto commentDto, User user, Topic topic);
    int countComment(Topic topic);
    Comment findCommentbyId(Integer id);
    void delete(Integer topicId);

}

package com.example.canteen.service;

import com.example.canteen.entity.Tags;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TagsService {
    List<Tags> getListTag();
}

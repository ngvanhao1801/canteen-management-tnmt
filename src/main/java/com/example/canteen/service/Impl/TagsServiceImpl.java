package com.example.canteen.service.Impl;

import com.example.canteen.entity.Tags;
import com.example.canteen.reponsitory.TagsReponsitory;
import com.example.canteen.service.TagsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TagsServiceImpl implements TagsService {
    @Autowired
    private TagsReponsitory tagsReponsitory;
    @Override
    public List<Tags> getListTag() {
        return tagsReponsitory.findAll();
    }
}

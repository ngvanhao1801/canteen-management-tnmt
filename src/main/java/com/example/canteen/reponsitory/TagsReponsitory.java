package com.example.canteen.reponsitory;

import com.example.canteen.entity.Tags;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface TagsReponsitory extends JpaRepository<Tags, Integer> {
}

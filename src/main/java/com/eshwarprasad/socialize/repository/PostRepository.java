package com.eshwarprasad.socialize.repository;

import com.eshwarprasad.socialize.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {

    List<Post> findByCategoryId(Long categoryId);

}

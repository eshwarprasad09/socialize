package com.eshwarprasad.socialize.repository;

import com.eshwarprasad.socialize.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}

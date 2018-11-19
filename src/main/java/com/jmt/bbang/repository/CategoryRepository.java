package com.jmt.bbang.repository;

import com.jmt.bbang.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface CategoryRepository extends JpaRepository<Category,Long> {
    Set<Category> findByParentId(Long parentId);
}

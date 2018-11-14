package com.jmt.bbang.repository;

import com.jmt.bbang.domain.Product;
import com.jmt.bbang.domain.ProductOption;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    public Product findBytId(Long productId);
}

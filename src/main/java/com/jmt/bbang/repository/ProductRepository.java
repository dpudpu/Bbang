package com.jmt.bbang.repository;

import com.jmt.bbang.domain.Product;
import com.jmt.bbang.domain.ProductOption;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Set;

public interface ProductRepository extends JpaRepository<Product, Long> {
    //다대일, 일대일 에서는 페치조인 사용 할 필요가 없다
    List<Product> findAll();

//    @Query(value = "select p from product p WHERE p.categoryId=:categoryId")
    List<Product> findByCategoryId(Long categoryId);

    @Query(value = "SELECT p FROM Product p JOIN FETCH p.category WHERE p.productName LIKE CONCAT('%',:productName,'%')")
    List<Product> findByProductNameContaining(@Param("productName") String productName);
}

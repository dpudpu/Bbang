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

    //SELECT * FROM product p INNER JOIN category c ON p.category_id=c.id WHERE c.parent_id = 1;
    @Query(value = "SELECT p FROM Product p JOIN FETCH p.category WHERE p.category.parentId = :categoryId",
           countQuery = "SELECT count(p) FROM Product p where p.category.parentId = :categoryId")
    Page<Product> findByCategoryId(@Param("categoryId") Long categoryId, Pageable pageable);

    // 앨리어스를 짧게 쓰는게 성능에 좋다.
    @Query(value = "SELECT p FROM Product p JOIN FETCH p.category WHERE p.productName LIKE CONCAT('%',:productName,'%')",
            countQuery = "SELECT count(p) FROM Product p where p.productName LIKE concat('%',:productName,'%') ")
    Page<Product> findByProductNameContaining(@Param("productName") String productName, Pageable pageable);

}

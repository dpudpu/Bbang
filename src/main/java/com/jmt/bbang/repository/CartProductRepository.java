package com.jmt.bbang.repository;

import com.jmt.bbang.domain.CartProduct;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CartProductRepository extends JpaRepository<CartProduct, Long> {
    List<CartProduct> findByMemberId(Long memberId);
}

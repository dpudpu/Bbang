package com.jmt.bbang.repository;

import com.jmt.bbang.domain.CartProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartProductRepository extends JpaRepository<CartProduct, Long> {
}

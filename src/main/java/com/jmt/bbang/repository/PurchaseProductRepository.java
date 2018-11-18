package com.jmt.bbang.repository;

import com.jmt.bbang.domain.PurchaseProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseProductRepository extends JpaRepository<PurchaseProduct, Long> {
}

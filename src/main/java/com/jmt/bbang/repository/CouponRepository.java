package com.jmt.bbang.repository;

import com.jmt.bbang.domain.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

public interface CouponRepository extends JpaRepository<Coupon,Long> {
    List<Coupon> findAllByOrderByDiscountRate();
    List<Coupon> findAllByOrderByDiscountRateDesc();
    List<Coupon> findAllByOrderByExpirationDate();
    List<Coupon> findAllByOrderByExpirationDateDesc();
    List<Coupon> findAllByOrderByQuantity();
    List<Coupon> findAllByOrderByQuantityDesc();


    @Query("SELECT c FROM Coupon c WHERE c.expirationDate BETWEEN :start AND :end ORDER BY c.expirationDate")
    List<Coupon> findByExpirationDateBetweenAndOrderByExpirationDate(@Param("start") Date start,@Param("end") Date end);
}

package com.jmt.bbang.repository;


import com.jmt.bbang.domain.ProductOption;
import org.springframework.data.jpa.repository.JpaRepository;


// JpaRepository : 저장, id에 해당하는 자료를 조회, 모든 데이터 조회, 삭제, 페이지 단위로 읽어오는 기능.
public interface ProductOptionRepository extends JpaRepository<ProductOption, Long> {

}

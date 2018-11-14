package com.jmt.bbang.repository;


import com.jmt.bbang.domain.ProductOption;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

// JpaRepository : 저장, id에 해당하는 자료를 조회, 모든 데이터 조회, 삭제, 페이지 단위로 읽어오는 기능.
public interface ProductOptionRepository extends JpaRepository<ProductOption,Long> {
    // Spring Data JPA method query
    // select * from article_group where name like ? limit ?
    public Page<ProductOption> findByProductId(Long productId, Pageable pageable);

    // JPQL
    @Query(value = "select po from ProductOption po where po.name like CONCAT('%',:name,'%')")
    public Page<ProductOption> findByNameContaining2(@Param("name")String name, Pageable pageable);

    // JPQL fetch join - 1 + N 문제를 해결, LAZY이지만 한꺼번에 데이터를 읽어올 수 있다.
    // fetch join + Pageable을 같이 사용할 경우엔 countQuery를 사용해야한다.
//    @Query(value = "select po from ProductOption po join fetch po.product_id where po.name like CONCAT('%',:name,'%')",
//            countQuery = "select count(po) from ProductOption po where po.name like CONCAT('%',:name,'%')")
//    public Page<ProductOption> findByNameContaining3(@Param("name")String name, Pageable pageable);

}

package com.jmt.bbang.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "product")
@Getter
@Setter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    // 나중에 구매목록에서 상품 링크를 클릭했을 경우 정보를 볼수있으려면 삭제해도
    // 게시판에서만 안보일뿐 상품 정보는 보여야하므로 추가해줌.
    @Column(columnDefinition = "bit default 0")
    private boolean deleted;
    private boolean cutting;

    private int price;
    private int pointRate;
    @Column(columnDefinition = "integer default 0")
    private int hit;
    private int quantity;
    @Column(columnDefinition = "integer default 0")
    private int totalSales;
    @Column(columnDefinition = "integer default 0")
    private int discount;

    @Column(length = 255, nullable = false)
    private String productName;
    @Column(length = 255, nullable = false)
    private String nutrition;
    @Column(columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime regdate;
    @Column(columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime updateDate;


    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;


    @OneToMany
    @JoinColumn(name = "product_id")
    private Set<ProductFile> productFiles;

    @OneToMany
    @JoinColumn(name = "product_id")
    private Set<ProductOption> productOptions;

}

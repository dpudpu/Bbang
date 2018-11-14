package com.jmt.bbang.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;
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
    @Column(name="deleted")
    private boolean deleted = false;
    private boolean cutting;

    private int price;
    private int pointRate;
    @Column(name = "hit")
    private int hit=0;
    private int quantity;
    @Column(name = "total_sales")
    private int totalSales=0;

    @Column(length = 255, nullable = false)
    private String productName;
    @Column(length = 255, nullable = false)
    private String nutrition;
    private LocalDateTime regdate;
    private LocalDateTime updateDate;



    @OneToMany(mappedBy = "product")
    private Set<ProductOption> productOptions;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @OneToOne(mappedBy = "product")
    private PurchaseProduct purchaseProducts;

    @OneToMany(mappedBy="product")
    private Set<Cart> carts;

}

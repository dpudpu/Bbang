package com.jmt.bbang.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "purchase_product")
@Getter
@Setter
public class PurchaseProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private int price;
    @Column(columnDefinition = "integer default 1")
    private int quantity;
    // 환불을 신청하면 true로 변환해주고 Refund 테이블에 추가해준다.

    @OneToOne
    @JoinColumn(name = "refund_id", unique = true)
    private Refund refund;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;




}

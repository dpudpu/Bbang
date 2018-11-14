package com.jmt.bbang.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "refund")
@Getter
@Setter
public class Refund {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 50, nullable = false)
    private String status;
    @Lob
    private String reason;
    private LocalDateTime regdate;
    @OneToOne
    @JoinColumn(name="purchase_product_id")
    private PurchaseProduct purchaseProduct;
}

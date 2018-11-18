package com.jmt.bbang.domain;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "purchase")
@Getter
@Setter
public class Purchase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;

    @OneToOne
    @JoinColumn(name = "delivery_id", unique = true)
    private Delivery delivery;

    @OneToMany
    @JoinColumn(name = "purchase_id")
    private Set<PurchaseProduct> purchaseProduct;

    @OneToOne
    @JoinColumn(name = "payment_id")
    private Payment payment;
}

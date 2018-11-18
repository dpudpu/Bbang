package com.jmt.bbang.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Getter
@Setter
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "DTYPE")
public abstract class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private int amount;
    @Column(columnDefinition="bit default 0")
    private boolean status;
    @Column(length = 100, nullable = false)
    private String type;


    @Column(columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime regdate;
    @OneToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name="purchase_id")
    private Purchase purchase;
}

@Entity
@DiscriminatorValue("C")
class Card extends Payment{
    @Column
    private String cardExpire;
    @Column(length = 100)
    private String cardNum;
    @Column
    private String cardHolder;
    @Column
    private String cardCompany;
}


@Entity
@DiscriminatorValue("B")
class Bank extends Payment{
    @Column(length = 100)
    private String bankAccount;
    @Column(length = 100)
    private String bankName;
    @Column
    private String remitter;
}
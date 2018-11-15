package com.jmt.bbang.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "payment")
@Getter
@Setter
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int amount;
    @Column(columnDefinition="bit default 0")
    private boolean status;
    @Column(length = 100, nullable = false)
    private String type;
    @Column(length = 100)
    private String bankAccount;
    @Column(length = 100)
    private String bankName;
    @Column(length = 100)
    private String cardName;
    @Column(length = 100)
    private String cardNum;
    @Column(columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime regdate;
    @OneToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name="purchase_id")
    private Purchase purchase;
}

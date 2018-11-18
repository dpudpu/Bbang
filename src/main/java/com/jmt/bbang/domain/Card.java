package com.jmt.bbang.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("C")
@Getter
@Setter
public class Card extends Payment{
    @Column
    private String cardExpire;
    @Column(length = 100)
    private String cardNum;
    @Column
    private String cardHolder;
    @Column
    private String cardCompany;
}
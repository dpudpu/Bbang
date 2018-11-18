package com.jmt.bbang.domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("B")
@Getter
@Setter
public class Bank extends Payment{
    @Column(length = 100)
    private String bankAccount;
    @Column(length = 100)
    private String bankName;
    @Column
    private String remitter;
}

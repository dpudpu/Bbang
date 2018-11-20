package com.jmt.bbang.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "member")
@Getter
@Setter
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 20, nullable = false)
    private String name;
    @Column(length = 20, nullable = false, unique = true)
    private String nickname;
    @Column(length = 255, nullable = false)
    private String password;
    @Column(length = 255, nullable = false, unique = true)
    private String email;
    // 1-여자, 2-남자, 3-그외 enum 사용? @Enumerated
    private int gender;
    @Column(length = 100, nullable = false)
    private String phoneNum;
    @Column(length = 255, nullable = false)
    private String addr;
    @Column(length = 255, nullable = false)
    private String addrDetails;
    @Column(length = 255, nullable = false)
    private String zipCode;
    @Column(columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime regdate;
    @Column(columnDefinition = "integer default 0")
    private int point;
    @Column(nullable = false)
    private boolean recieveMail;
    @Column(nullable = false)
    private boolean recieveSms;

    @ManyToMany
    @JoinTable(name = "member_role",
            joinColumns = @JoinColumn(name = "member_id", referencedColumnName = "id") ,
            inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id") )
    private Set<Role> roles;

    @ManyToMany
    @JoinTable(name = "member_coupon",
            joinColumns = @JoinColumn(name = "member_id", referencedColumnName = "id") ,
            inverseJoinColumns = @JoinColumn(name = "coupon_id", referencedColumnName = "id") )
    private List<Coupon> memberCoupon;


    @ManyToMany
    @JoinTable(name = "wish_product",
            joinColumns = @JoinColumn(name = "member_id", referencedColumnName = "id") ,
            inverseJoinColumns = @JoinColumn(name = "product_id", referencedColumnName = "id") )
    private Set<Product> wishProducts;
}

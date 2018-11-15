# Bbang
Spring boot Project


- 결제정보 카드, 계좌 나눠서 엔티티 ?
- 환불과 결제내역 누가 외래키?
- 쿠폰은 양방향 (상품에서 적용가능한 쿠폰들이 필할수도)
```java
@ManyToMany(fetch = FetchType.LAZY, mappedBy = "couponProducts")
private Set<Coupon> Coupons;
```

package com.jmt.bbang.repository;

import com.jmt.bbang.domain.Product;
import com.jmt.bbang.domain.ProductOption;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;

@RunWith(SpringRunner.class)
@DataJpaTest
@Transactional
public class ProductRepositoryTests {
    @Autowired
    ProductRepository productRepository;
    @Autowired
    ProductOptionRepository productOptionRepository;
    @Autowired
    CategoryRepository categoryRepository;

    @Test
    public void 모두검색() {
        Pageable pageable = PageRequest.of(0, 5);
        Page<Product> products = productRepository.findAll(pageable);

        System.out.println("==================");
        for (Product p : products) {
            System.out.println(p.getId() + ", " + p.getProductName() + ", "
                    + p.getPrice() + ", " + p.getCategory().getName() + ", ");
        }
        System.out.println("==================");
    }

    @Test
    public void 부모categoryId로검색() {

        Pageable pageable = PageRequest.of(0, 5);
        Page<Product> products = productRepository.findByCategoryId(1L, pageable);

        System.out.println(products.getTotalElements());
        System.out.println(products.getTotalPages());
        for (Product p : products) {
            System.out.println(p.getId() + ", " + p.getProductName() + ", "
                    + p.getPrice());
        }
    }

//    @Test
//    public void 이름으로검색() {
//        List<Product> products = productRepository.findByProductNameContaining("빵");
//        System.out.println("==================");
//        for (Product p : products) {
//            System.out.println(p.getId() + ", " + p.getProductName() + ", "
//                    + p.getPrice() + ", " + p.getCategory().getName() + ", ");
//        }
//        System.out.println("==================");
//    }

    @Test
    public void 상세보기검색() {
        Product product = productRepository.getOne(1L);
        System.out.println(product.getProductName() + " " + product.getPrice() + "원");

        Set<ProductOption> productOptions = product.getProductOptions();
        for (ProductOption po : productOptions)
            System.out.println(po.getName() + " " + po.getDiscount());

    }
}
